package com.dsi.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompetitionService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";
    //private String apiKey = "96a428ad93b640e9b9218c3f8fa9cc9e";

    public CompetitionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getMatches() {
        String url = BASE_URL + "/matches";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getTeams(String id) {
        String url = BASE_URL + "/competitions/" + id + "/teams";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getScorers(String id) {
        String url = BASE_URL + "/competitions/" + id + "/scorers";
        return restTemplate.getForObject(url, Object.class);
    }
}
