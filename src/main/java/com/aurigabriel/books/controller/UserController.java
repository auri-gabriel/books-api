package com.aurigabriel.books.controller;

import com.aurigabriel.books.dto.UserCreateRequestDTO;
import com.aurigabriel.books.dto.UserDTO;
import com.aurigabriel.books.mapper.UserMapper;
import com.aurigabriel.books.model.User;
import com.aurigabriel.books.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userService;

    @PostMapping("/users")
    public UserDTO createUser(@RequestBody UserCreateRequestDTO userRequest) {
        User createdUser = userService.createUser(userRequest.getUsername(), userRequest.getPassword());
        return UserMapper.toDto(createdUser);
    }
}

