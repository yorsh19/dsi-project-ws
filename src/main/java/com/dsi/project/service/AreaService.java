package com.dsi.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AreaService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";

    public AreaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getArea(String id) {
        String url = BASE_URL + "/competitions/" + id + "/";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getAllAreas() {
        String url = BASE_URL + "/areas/";
        return restTemplate.getForObject(url, Object.class);
    }
}

