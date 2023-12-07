package com.auth.dtos;

import com.auth.entities.ProductEntitie;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(ProductEntitie product){
        this(product.getId(), product.getName(), product.getPrice());
    }
}
