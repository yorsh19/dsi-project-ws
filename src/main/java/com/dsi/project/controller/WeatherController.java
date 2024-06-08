package com.dsi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.project.model.response.WeatherResponse;
import com.dsi.project.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin("*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping()
    public WeatherResponse fetchWeather(@RequestParam("city") String city) {
        return weatherService.fetchAndSaveWeather(city);
    }
}

