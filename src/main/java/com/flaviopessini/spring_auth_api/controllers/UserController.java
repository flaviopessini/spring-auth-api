package com.flaviopessini.spring_auth_api.controllers;

import com.flaviopessini.spring_auth_api.domain.user.User;
import com.flaviopessini.spring_auth_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> allUsers() {
        final var users = userService.allUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/me")
    public ResponseEntity<User> authenticatedUser() {
        final var authentication = SecurityContextHolder.getContext().getAuthentication();
        final var currentUser = (User) authentication.getPrincipal();
        return ResponseEntity.ok(currentUser);
    }
}
