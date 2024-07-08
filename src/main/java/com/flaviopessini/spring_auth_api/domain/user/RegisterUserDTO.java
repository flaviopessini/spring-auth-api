package com.flaviopessini.spring_auth_api.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterUserDTO {
    @NotNull
    @NotEmpty
    String fullName;

    @Email
    @NotNull
    @NotEmpty
    String email;

    @NotNull
    @NotEmpty
    String password;
}
