package com.henrique20o.weatherHub_API.dto.user;

public class UserResponseDTO {
    private final String name;
    private final String email;

    public UserResponseDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
