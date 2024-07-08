package com.flaviopessini.spring_auth_api.domain.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginResponseDTO {

    @NotNull
    @NotEmpty
    String token;

    @NotNull
    @NotEmpty
    Long expiresIn;
}
