package com.maxley.virtualstore.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxley.virtualstore.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
