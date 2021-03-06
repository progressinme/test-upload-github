package com.progressinme.spring.ecommerce.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.progressinme.spring.ecommerce.mongodb.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	public Product findByName(String name);
}
