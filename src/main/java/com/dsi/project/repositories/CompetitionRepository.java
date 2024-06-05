package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Competition;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {}
