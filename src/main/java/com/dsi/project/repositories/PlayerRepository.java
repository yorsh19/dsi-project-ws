package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {}
