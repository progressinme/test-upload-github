package com.progressinme.spring.ecommerce.mongodb.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
	private String id;

	private String name;
	private String description;
	private float price;
	private List<String> imageURL = new ArrayList<>();

	@DBRef
	private Seller seller;

	private Set<EmbeddedCategory> fallIntoCategories = new HashSet<>();

	public Product() {

	}

	public Product(String name, String description, float price, Seller seller,
			Set<EmbeddedCategory> fallIntoCategories) {

		this.name = name;
		this.description = description;
		this.price = price;
		this.seller = seller;
		this.fallIntoCategories = fallIntoCategories;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<String> getImageURL() {
		return imageURL;
	}

	public void setImageURL(List<String> imageURL) {
		this.imageURL = imageURL;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Set<EmbeddedCategory> getFallIntoCategories() {
		return fallIntoCategories;
	}

	public void setFallIntoCategories(Set<EmbeddedCategory> fallIntoCategories) {
		this.fallIntoCategories = fallIntoCategories;
	}

}
