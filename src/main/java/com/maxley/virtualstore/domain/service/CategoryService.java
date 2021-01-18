package com.maxley.virtualstore.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxley.virtualstore.domain.model.Category;
import com.maxley.virtualstore.domain.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category find(Long categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		
		return category.orElse(null);
	}
}
