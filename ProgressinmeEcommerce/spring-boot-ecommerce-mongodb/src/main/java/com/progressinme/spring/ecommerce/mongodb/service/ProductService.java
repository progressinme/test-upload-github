package com.progressinme.spring.ecommerce.mongodb.service;

import com.progressinme.spring.ecommerce.mongodb.model.Product;

public interface ProductService {

	public Iterable<Product> getAllProducts();

	public Product getProduct(Long id);

	public Product save(Product product);

}
