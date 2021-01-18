package com.maxley.virtualstore.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxley.virtualstore.domain.model.Category;
import com.maxley.virtualstore.domain.service.CategoryService;

@RestController
@RequestMapping("/categorias")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/{categoryId}")
	private ResponseEntity<Category> find(@PathVariable Long categoryId) {
		Category category = categoryService.find(categoryId);
		return ResponseEntity.ok(category);
	}																															
}
