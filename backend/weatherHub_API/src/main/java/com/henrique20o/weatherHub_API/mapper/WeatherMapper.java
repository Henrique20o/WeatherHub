package com.henrique20o.weatherHub_API.mapper;

import com.henrique20o.weatherHub_API.dto.weather.WeatherResponseDTO;
import com.henrique20o.weatherHub_API.model.WeatherModel;
import org.springframework.stereotype.Component;

@Component
public class WeatherMapper {

    public WeatherResponseDTO toDto(WeatherModel model) {
        if (model == null) return null;

        return new WeatherResponseDTO(
                model.getCity(),
                model.getCountry(),
                model.getTemperature(),
                model.getHumidity(),
                model.getPrecipitation(),
                model.getWind(),
                model.getSearchDate()
        );
    }
}
