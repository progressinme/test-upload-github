package com.progressinme.spring.ecommerce.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.progressinme.spring.ecommerce.mongodb.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
	public Category findByName(String categoryName);
}
