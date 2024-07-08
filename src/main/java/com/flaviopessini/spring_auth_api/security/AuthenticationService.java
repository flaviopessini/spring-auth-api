package com.flaviopessini.spring_auth_api.security;

import com.flaviopessini.spring_auth_api.domain.user.LoginUserDTO;
import com.flaviopessini.spring_auth_api.domain.user.RegisterUserDTO;
import com.flaviopessini.spring_auth_api.domain.user.User;
import com.flaviopessini.spring_auth_api.domain.user.UserRole;
import com.flaviopessini.spring_auth_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    public User signup(RegisterUserDTO input) {
        final var user = User.builder()
                .fullName(input.getFullName())
                .email(input.getEmail())
                .password(passwordEncoder.encode(input.getPassword()))
                .role(UserRole.USER)
                .build();

        return userRepository.save(user);
    }

    public User authenticate(LoginUserDTO input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword())
        );

        return userRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}
