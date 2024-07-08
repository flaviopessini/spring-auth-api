package com.flaviopessini.spring_auth_api.repositories;

import com.flaviopessini.spring_auth_api.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
