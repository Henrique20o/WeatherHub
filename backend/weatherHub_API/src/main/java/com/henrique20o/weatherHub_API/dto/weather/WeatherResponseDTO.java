package com.henrique20o.weatherHub_API.dto.weather;

import java.time.LocalDateTime;

public class WeatherResponseDTO {
    private final String city;
    private final String country;
    private final double temperature;
    private final float humidity;
    private final float precipitation;
    private final float wind;
    private final LocalDateTime searchDate;

    public WeatherResponseDTO(String city, String country, double temperature, float humidity, float precipitation, float wind, LocalDateTime searchDate) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.wind = wind;
        this.searchDate = searchDate;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPrecipitation() {
        return precipitation;
    }

    public float getWind() {
        return wind;
    }

    public LocalDateTime getSearchDate() {
        return searchDate;
    }
}
