package com.dsi.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi.project.model.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}

