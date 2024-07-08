package com.flaviopessini.spring_auth_api.domain.product;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProductRequestDTO {
    @NotNull
    String name;

    @NotNull
    BigDecimal price;
}
