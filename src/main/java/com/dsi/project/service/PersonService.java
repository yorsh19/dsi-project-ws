package com.dsi.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";

    public PersonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getPerson(String id) {
        String url = BASE_URL + "/persons/" + id;
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getPersonMatches(String id, int limit) {
        String url = BASE_URL + "/persons/" + id + "/matches?limit=" + limit;
        return restTemplate.getForObject(url, Object.class);
    }
}

