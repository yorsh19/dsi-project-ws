package com.dsi.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";

    public TeamService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getTeam(String id) {
        String url = BASE_URL + "/teams/" + id + "/";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getAllTeams(int limit, int offset) {
        String url = BASE_URL + "/teams?limit=" + limit + "&offset=" + offset;
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getTeamMatches(String id) {
        String url = BASE_URL + "/teams/" + id + "/matches";
        return restTemplate.getForObject(url, Object.class);
    }
}
