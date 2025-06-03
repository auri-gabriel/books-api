package com.aurigabriel.books.mapper;

import com.aurigabriel.books.dto.UserDTO;
import com.aurigabriel.books.model.User;

public class UserMapper {
    public static UserDTO toDto(User user) {
        return new UserDTO(user.getId(), user.getUsername());
    }
}

