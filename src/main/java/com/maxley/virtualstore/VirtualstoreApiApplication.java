package com.maxley.virtualstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxley.virtualstore.domain.model.Category;
import com.maxley.virtualstore.domain.model.Product;
import com.maxley.virtualstore.domain.repository.CategoryRepository;
import com.maxley.virtualstore.domain.repository.ProductRepository;

@SpringBootApplication
public class VirtualstoreApiApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(VirtualstoreApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(null, "Informatica");
		Category category2 = new Category(null, "Escritorio");
		
		Product product1 = new Product(null, "Computador", 2000.00);
		Product product2 = new Product(null, "Impressora", 800.00);
		Product product3 = new Product(null, "Mouse", 80.00);
		
		category1.getProducts().addAll(Arrays.asList(product1, product2, product3));
		category2.getProducts().addAll(Arrays.asList(product2));
		
		product1.getCategories().addAll(Arrays.asList(category1));
		product2.getCategories().addAll(Arrays.asList(category1, category2));
		product3.getCategories().addAll(Arrays.asList(category1));
		
		categoryRepository.saveAll(Arrays.asList(category1, category2));	
		productRepository.saveAll(Arrays.asList(product1, product2, product3));
	}

}
