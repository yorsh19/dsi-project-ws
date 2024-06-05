package com.dsi.project.controller;

import org.springframework.web.bind.annotation.*;

import com.dsi.project.service.TeamService;

@RestController
@RequestMapping("/teams")
@CrossOrigin("*")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{id}")
    public Object getTeam(@PathVariable String id) {
        return teamService.getTeam(id);
    }

    @GetMapping
    public Object getAllTeams(@RequestParam int limit, @RequestParam int offset) {
        return teamService.getAllTeams(limit, offset);
    }

    @GetMapping("/{id}/matches")
    public Object getTeamMatches(@PathVariable String id) {
        return teamService.getTeamMatches(id);
    }
}

