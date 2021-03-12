package com.progressinme.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progressinme.service.user.VO.ResponseTemplateVO;
import com.progressinme.service.user.entity.User;
import com.progressinme.service.user.service.SequenceGeneratorService;
import com.progressinme.service.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	private SequenceGeneratorService sequenceService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of UserController");
		user.setUserId(sequenceService.getSequenceNumber(User.SEQUENCE_NAME));
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside findUserByDepartmentId method of UserController");
		return userService.getUserWithDepartment(userId);
	}
}
