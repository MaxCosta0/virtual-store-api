package com.maxley.virtualstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxley.virtualstore.domain.Category;
import com.maxley.virtualstore.repository.CategoryRepository;
import com.maxley.virtualstore.service.exception.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category find(Long categoryId) {
		Optional<Category> category = categoryRepository.findById(categoryId);
		
		return category.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! id: " + categoryId + ", Tipo: " + Category.class.getName()));
	}
}
