package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {}
