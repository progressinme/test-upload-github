package com.progressinme.spring.ecommerce.mongodb.repository;

import org.springframework.data.repository.CrudRepository;

import com.progressinme.spring.ecommerce.mongodb.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
