package com.dsi.project.config;

import java.io.IOException;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.singletonList(new AuthInterceptor()));
        return restTemplate;
    }

    class AuthInterceptor implements ClientHttpRequestInterceptor {
        private static final String AUTH_TOKEN = "96a428ad93b640e9b9218c3f8fa9cc9e"; // Reemplaza con tu token

        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
                throws IOException {
            request.getHeaders().add("X-Auth-Token", AUTH_TOKEN);
            return execution.execute(request, body);
        }
    }
}
