package com.henrique20o.weatherHub_API.dto.weather;

public class WeatherSearchDTO {
    private final String city;

    public WeatherSearchDTO(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
