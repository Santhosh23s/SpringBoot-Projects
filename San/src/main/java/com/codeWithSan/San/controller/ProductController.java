package com.codeWithSan.San.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWithSan.San.Models.Product;
import com.codeWithSan.San.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	public List<Map<String,Object>> ProDetails(){
		return Arrays.asList(
				Map.of("Name","Product 1","Price",256),
				Map.of("Name","Product 2","Price",896)
				);
	}
}
