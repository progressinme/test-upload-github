package com.progressinme.service.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.progressinme.service.user.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUserId(Long userId);

}
