package com.henrique20o.weatherHub_API.model;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserModelTest {

    @Test
    void testConstructorAndGettersAndPrePersist() {
        UserModel user = new UserModel("John", "john@example.com", "secret");
        assertNull(user.getId());
        assertEquals("John", user.getName());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("secret", user.getPassword());
        assertNull(user.getCreatedAt());

        user.onCreate();
        assertNotNull(user.getCreatedAt());
    }

    @Test
    void testAllArgsConstructorDoesNotOverwriteCreatedAt() {
        UUID id = UUID.randomUUID();
        Date created = new Date(1000L);
        UserModel user = new UserModel(id, "Jane", "jane@example.com", "pwd", created);
        assertEquals(id, user.getId());
        assertEquals(created, user.getCreatedAt());

        user.onCreate();
        assertEquals(created, user.getCreatedAt());
    }

    @Test
    void testSetters() {
        UserModel user = new UserModel("a","b","c");
        user.setName("New");
        user.setEmail("new@example.com");
        user.setPassword("p");
        Date now = new Date();
        user.setCreatedAt(now);
        assertEquals("New", user.getName());
        assertEquals("new@example.com", user.getEmail());
        assertEquals("p", user.getPassword());
        assertSame(now, user.getCreatedAt());
    }
}

