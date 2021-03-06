package com.progressinme.spring.ecommerce.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.progressinme.spring.ecommerce.mongodb.model.Product;
import com.progressinme.spring.ecommerce.mongodb.service.ProductService;

@SpringBootApplication
public class SpringBootEcommerceMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceMongodbApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(new Product("Camera", 123456.00, "http://camera.com"));
		};
	}
}
