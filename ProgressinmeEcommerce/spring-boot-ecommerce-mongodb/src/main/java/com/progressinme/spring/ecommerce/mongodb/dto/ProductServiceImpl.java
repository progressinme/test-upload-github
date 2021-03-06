package com.progressinme.spring.ecommerce.mongodb.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.progressinme.spring.ecommerce.mongodb.model.Product;
import com.progressinme.spring.ecommerce.mongodb.repository.ProductRepository;
import com.progressinme.spring.ecommerce.mongodb.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);

	}

}
