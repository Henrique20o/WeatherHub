package com.henrique20o.weatherHub_API.dto.weather;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class WeatherResponseDTOTest {

    @Test
    void getters() {
        LocalDateTime now = LocalDateTime.of(2024,1,2,3,4,5);
        WeatherResponseDTO dto = new WeatherResponseDTO("City", "Country", 12.34, 45.6f, 0.7f, 8.9f, now);

        assertEquals("City", dto.getCity());
        assertEquals("Country", dto.getCountry());
        assertEquals(12.34, dto.getTemperature(), 0.0001);
        assertEquals(45.6f, dto.getHumidity(), 0.0001f);
        assertEquals(0.7f, dto.getPrecipitation(), 0.0001f);
        assertEquals(8.9f, dto.getWind(), 0.0001f);
        assertEquals(now, dto.getSearchDate());
    }
}

