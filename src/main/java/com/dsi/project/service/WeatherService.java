package com.dsi.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dsi.project.model.Weather;
import com.dsi.project.model.response.WeatherResponse;
import com.dsi.project.repositories.WeatherRepository;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    private final String baseUrl = "http://api.weatherapi.com/v1/current.json?key=56370cd960a745239ec174241240106&q=";

    public WeatherResponse fetchAndSaveWeather(String city) {
        String apiUrl = baseUrl + city + "&aqi=no";
        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse response = restTemplate.getForObject(apiUrl, WeatherResponse.class);

        Weather weather = new Weather();
        weather.setCityName(response.getLocation().getName());
        weather.setRegion(response.getLocation().getRegion());
        weather.setCountry(response.getLocation().getCountry());
        weather.setLat(response.getLocation().getLat());
        weather.setLon(response.getLocation().getLon());
        weather.setLocalTime(response.getLocation().getLocaltime());

        weather.setTempC(response.getCurrent().getTemp_c());
        weather.setTempF(response.getCurrent().getTemp_f());
        weather.setConditionText(response.getCurrent().getCondition().getText());
        weather.setWindDir(response.getCurrent().getWind_dir());
        weather.setWindMph(response.getCurrent().getWind_mph());
        weather.setWindKph(response.getCurrent().getWind_kph());
        weather.setPressureMb(response.getCurrent().getPressure_mb());
        weather.setPrecipMm(response.getCurrent().getPrecip_mm());
        weather.setHumidity(response.getCurrent().getHumidity());
        weather.setCloud(response.getCurrent().getCloud());
        weather.setFeelslikeC(response.getCurrent().getFeelslike_c());
        weather.setFeelslikeF(response.getCurrent().getFeelslike_f());
        weather.setVisKm(response.getCurrent().getVis_km());
        weather.setVisMiles(response.getCurrent().getVis_miles());
        weather.setUv(response.getCurrent().getUv());
        weather.setGustMph(response.getCurrent().getGust_mph());
        weather.setGustKph(response.getCurrent().getGust_kph());

        weatherRepository.save(weather);

        return response;
    }
}
