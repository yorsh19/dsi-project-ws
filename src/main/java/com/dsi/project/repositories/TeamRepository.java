package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {}
