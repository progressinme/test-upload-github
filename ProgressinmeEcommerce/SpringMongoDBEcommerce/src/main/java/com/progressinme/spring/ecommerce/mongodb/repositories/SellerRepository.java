package com.progressinme.spring.ecommerce.mongodb.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.progressinme.spring.ecommerce.mongodb.model.Seller;

public interface SellerRepository extends MongoRepository<Seller, String> {
	@Query()
	public List<Seller> findByFirstName(String firstName);
}
