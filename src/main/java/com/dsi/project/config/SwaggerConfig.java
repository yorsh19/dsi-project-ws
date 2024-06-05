package com.dsi.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("Proyecto DSI REST API")
                        .description("Some custom description of API.")
                        .version("1.0").contact(new Contact().name("RaldaC")
                                .url("www.raldacdev.com").email("raldacdev@gmail.com"))
                        .license(new License().name("License of API")
                                .url("API license URL")));
    }

}
