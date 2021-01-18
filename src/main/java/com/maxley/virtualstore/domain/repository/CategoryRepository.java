package com.maxley.virtualstore.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maxley.virtualstore.domain.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
