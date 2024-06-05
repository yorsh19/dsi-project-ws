package com.dsi.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompetitionService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";

    public CompetitionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getCompetition(String id) {
        String url = BASE_URL + "/competitions/" + id + "/";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getAllCompetitions(String areas) {
        String url = "";
        if(areas != null){
         url = BASE_URL + "/competitions/?areas=" + areas;
        } else{
            url = BASE_URL + "/matches/";
        }
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getStandings(String id, String season, String matchday) {
        String url = BASE_URL + "/competitions/" + id + "/standings?season=" + season + "&matchday=" + matchday;
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getMatches(String id, String matchday) {
        String url = BASE_URL + "/competitions/" + id + "/matches?matchday=" + matchday;
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

