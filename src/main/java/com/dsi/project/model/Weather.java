package com.dsi.project.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    private String region;
    private String country;
    private double lat;
    private double lon;

    @Column(name = "local_time")
    private String localTime;

    @Column(name = "temp_c")
    private double tempC;

    @Column(name = "temp_f")
    private double tempF;

    @Column(name = "condition_text")
    private String conditionText;

    @Column(name = "wind_dir")
    private String windDir;

    @Column(name = "wind_mph")
    private double windMph;

    @Column(name = "wind_kph")
    private double windKph;

    @Column(name = "pressure_mb")
    private double pressureMb;

    @Column(name = "precip_mm")
    private double precipMm;

    private int humidity;
    private int cloud;

    @Column(name = "feelslike_c")
    private double feelslikeC;

    @Column(name = "feelslike_f")
    private double feelslikeF;

    @Column(name = "vis_km")
    private double visKm;

    @Column(name = "vis_miles")
    private double visMiles;

    private double uv;

    @Column(name = "gust_mph")
    private double gustMph;

    @Column(name = "gust_kph")
    private double gustKph;

    // Getters and setters
}


