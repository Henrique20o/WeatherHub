package com.henrique20o.weatherHub_API.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class WeatherModelTest {

    @Test
    void testNoArgsConstructorSettersAndGetters() {
        WeatherModel model = new WeatherModel();

        UUID id = UUID.randomUUID();
        UUID userId = UUID.randomUUID();
        model.setId(id);
        model.setUserId(userId);
        model.setCity("Sao Paulo");
        model.setCountry("BR");
        model.setTemperature(25.5f);
        model.setHumidity(60.0f);
        model.setPrecipitation(0.1f);
        model.setWind(5.2f);
        LocalDateTime now = LocalDateTime.now();
        model.setSearchDate(now);

        assertEquals(id, model.getId());
        assertEquals(userId, model.getUserId());
        assertEquals("Sao Paulo", model.getCity());
        assertEquals("BR", model.getCountry());
        assertEquals(25.5f, model.getTemperature(), 0.0001f);
        assertEquals(60.0f, model.getHumidity(), 0.0001f);
        assertEquals(0.1f, model.getPrecipitation(), 0.0001f);
        assertEquals(5.2f, model.getWind(), 0.0001f);
        assertEquals(now, model.getSearchDate());
    }
}

