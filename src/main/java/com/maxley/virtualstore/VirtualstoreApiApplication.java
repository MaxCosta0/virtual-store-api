package com.maxley.virtualstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxley.virtualstore.domain.model.Category;
import com.maxley.virtualstore.domain.repository.CategoryRepository;

@SpringBootApplication
public class VirtualstoreApiApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(VirtualstoreApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(null, "Informatica");
		Category category2 = new Category(null, "Escritorio");
		
		categoryRepository.saveAll(Arrays.asList(category1, category2));		
	}

}
