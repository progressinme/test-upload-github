package com.progressinme.spring.ecommerce.mongodb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
@TypeAlias(value = "Category")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;

	@DBRef(lazy = true)
	private List<Product> productsOfCategory = new ArrayList<>();

	public Category() {

	}

	public Category(String name) {
		this.name = name;
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

	public List<Product> getProductsOfCategory() {
		return productsOfCategory;
	}

	public void setProductsOfCategory(List<Product> productsOfCategory) {
		this.productsOfCategory = productsOfCategory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
