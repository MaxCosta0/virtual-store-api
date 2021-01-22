package com.maxley.virtualstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxley.virtualstore.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
