package com.progressinme.spring.ecommerce.mongodb.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progressinme.spring.ecommerce.mongodb.model.Product;
import com.progressinme.spring.ecommerce.mongodb.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping(value = { "", "/" })
	public @NotNull Iterable<Product> getProduct() {
		return productService.getAllProducts();
	}
}
