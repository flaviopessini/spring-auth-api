package com.flaviopessini.spring_auth_api.domain.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProductResponseDTO {
    String id;

    String name;

    BigDecimal price;
}