package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {}
