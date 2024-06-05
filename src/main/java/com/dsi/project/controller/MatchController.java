package com.dsi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dsi.project.model.Match;
import com.dsi.project.service.MatchService;

import java.util.List;

@RestController
@RequestMapping("/matches")
@CrossOrigin("*")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.saveMatch(match);
    }

    @GetMapping("/api/{id}")
    public Object getMatch(@PathVariable String id) {
        return matchService.getMatch(id);
    }

    @GetMapping("/api")
    public Object getAllMatchesAPI() {
        return matchService.getAllMatchesAPI();
    }

    @GetMapping("/{id}/head2head")
    public Object getHead2Head(@PathVariable String id, @RequestParam int limit) {
        return matchService.getHead2Head(id, limit);
    }
}

