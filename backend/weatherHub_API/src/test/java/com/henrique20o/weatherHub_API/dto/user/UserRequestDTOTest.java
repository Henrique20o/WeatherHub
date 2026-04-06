package com.henrique20o.weatherHub_API.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRequestDTOTest {

    @Test
    void gettersAndSetters() {
        UserRequestDTO dto = new UserRequestDTO();
        dto.setName("Henrique");
        dto.setEmail("henrique@example.com");
        dto.setPassword("supersecret");

        assertEquals("Henrique", dto.getName());
        assertEquals("henrique@example.com", dto.getEmail());
        assertEquals("supersecret", dto.getPassword());
    }

    @Test
    void passwordFieldHasWriteOnlyJsonProperty() throws Exception {
        java.lang.reflect.Field field = UserRequestDTO.class.getDeclaredField("password");
        JsonProperty ann = field.getAnnotation(JsonProperty.class);
        assertNotNull(ann, "password field should be annotated with @JsonProperty");
        assertEquals(JsonProperty.Access.WRITE_ONLY, ann.access(), "password field should be write-only in JSON");
    }
}
