package com.flaviopessini.spring_auth_api.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
