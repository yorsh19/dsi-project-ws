package com.dsi.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dsi.project.model.Match;
import com.dsi.project.repositories.MatchRepository;

import java.util.List;

@Service
public class MatchService {

    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api.football-data.org/v4";

    @Autowired
    private MatchRepository matchRepository;

    public MatchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    public Object getMatch(String id) {
        String url = BASE_URL + "/matches/" + id;
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getAllMatchesAPI() {
        String url = BASE_URL + "/matches/";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getHead2Head(String id, int limit) {
        String url = BASE_URL + "/matches/" + id + "/head2head?limit=" + limit;
        return restTemplate.getForObject(url, Object.class);
    }
}

