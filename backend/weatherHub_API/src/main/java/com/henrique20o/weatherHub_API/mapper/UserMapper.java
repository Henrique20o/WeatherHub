package com.henrique20o.weatherHub_API.mapper;

import com.henrique20o.weatherHub_API.dto.user.UserRequestDTO;
import com.henrique20o.weatherHub_API.dto.user.UserResponseDTO;
import com.henrique20o.weatherHub_API.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserMapper {

    public UserResponseDTO toDto(UserModel user) {
        if (user == null) return null;
        return new UserResponseDTO(user.getName(), user.getEmail());
    }

    public UserModel toModel(UserRequestDTO dto) {
        if (dto == null) return null;
        return new UserModel(dto.getName(), dto.getEmail(), dto.getPassword());
    }
}
