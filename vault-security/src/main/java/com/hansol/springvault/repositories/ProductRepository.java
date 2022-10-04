package com.hansol.springvault.repositories;

import com.hansol.springvault.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
