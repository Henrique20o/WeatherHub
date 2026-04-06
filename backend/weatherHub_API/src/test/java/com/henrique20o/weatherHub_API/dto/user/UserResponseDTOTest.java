package com.henrique20o.weatherHub_API.dto.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserResponseDTOTest {

    @Test
    void getters() {
        UserResponseDTO dto = new UserResponseDTO("Henrique", "henrique@example.com");
        assertEquals("Henrique", dto.getName());
        assertEquals("henrique@example.com", dto.getEmail());
    }
}

