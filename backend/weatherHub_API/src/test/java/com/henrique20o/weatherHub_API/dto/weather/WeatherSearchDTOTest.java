package com.henrique20o.weatherHub_API.dto.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherSearchDTOTest {

    @Test
    void getter() {
        WeatherSearchDTO dto = new WeatherSearchDTO("Recife");
        assertEquals("Recife", dto.getCity());
    }
}

