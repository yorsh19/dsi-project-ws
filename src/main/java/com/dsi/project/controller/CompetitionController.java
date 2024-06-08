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

    @GetMapping("/matches")
    public Object getMatches() {
        return competitionService.getMatches();
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
