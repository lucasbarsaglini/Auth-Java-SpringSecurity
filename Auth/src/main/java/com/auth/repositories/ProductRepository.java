package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auth.entities.ProductEntitie;

public interface ProductRepository extends JpaRepository<ProductEntitie, String> {
}
