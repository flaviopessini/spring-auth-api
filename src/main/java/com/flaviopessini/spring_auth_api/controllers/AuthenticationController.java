package com.flaviopessini.spring_auth_api.controllers;

import com.flaviopessini.spring_auth_api.domain.user.LoginResponseDTO;
import com.flaviopessini.spring_auth_api.domain.user.LoginUserDTO;
import com.flaviopessini.spring_auth_api.domain.user.RegisterUserDTO;
import com.flaviopessini.spring_auth_api.security.AuthenticationService;
import com.flaviopessini.spring_auth_api.security.JwtService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterUserDTO registerUserDto) {
        final var registeredUser = authenticationService.signup(registerUserDto);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody LoginUserDTO loginUserDto) {
        final var authenticatedUser = authenticationService.authenticate(loginUserDto);
        final var jwtToken = jwtService.generateToken(authenticatedUser);
        final var loginResponse = LoginResponseDTO.builder().token(jwtToken).expiresIn(jwtService.getExpirationTime()).build();
        return ResponseEntity.ok(loginResponse);
    }
}
