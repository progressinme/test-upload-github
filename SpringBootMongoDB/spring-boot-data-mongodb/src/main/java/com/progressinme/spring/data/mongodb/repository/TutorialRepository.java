package com.progressinme.spring.data.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.progressinme.spring.data.mongodb.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	public List<Tutorial> findByTitle(String title);

	public List<Tutorial> findByPublished(boolean published);
}
