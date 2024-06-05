package com.dsi.project.controller;

import org.springframework.web.bind.annotation.*;

import com.dsi.project.service.CompetitionService;

@RestController
@RequestMapping("/competitions")
@CrossOrigin("*")
public class CompetitionController {
    private final CompetitionService competitionService;

    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }

    @GetMapping("/{id}")
    public Object getCompetition(@PathVariable String id) {
        return competitionService.getCompetition(id);
    }

    @GetMapping
    public Object getAllCompetitions(@RequestParam(value = "areas", required = false) String areas) {
        return competitionService.getAllCompetitions(areas);
    }

    @GetMapping("/{id}/standings")
    public Object getStandings(@PathVariable String id, @RequestParam String season, @RequestParam String matchday) {
        return competitionService.getStandings(id, season, matchday);
    }

    @GetMapping("/{id}/matches")
    public Object getMatches(@PathVariable String id, @RequestParam String matchday) {
        return competitionService.getMatches(id, matchday);
    }

    @GetMapping("/{id}/teams")
    public Object getTeams(@PathVariable String id) {
        return competitionService.getTeams(id);
    }

    @GetMapping("/{id}/scorers")
    public Object getScorers(@PathVariable String id) {
        return competitionService.getScorers(id);
    }
}
