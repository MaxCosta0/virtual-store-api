package com.maxley.virtualstore.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoryResource {
	
	@GetMapping
	private String list() {
		return "Hello World!!!";
	}
}
