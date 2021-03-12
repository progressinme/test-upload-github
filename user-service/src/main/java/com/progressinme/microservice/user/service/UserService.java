package com.progressinme.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.progressinme.service.user.VO.Department;
import com.progressinme.service.user.VO.ResponseTemplateVO;
import com.progressinme.service.user.entity.User;
import com.progressinme.service.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser method of UserService");
		return userRepository.save(user);
	}

	public User findUserById(Long userId) {
		log.info("Inside findUserById method of UserService");
		return userRepository.findByUserId(userId);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment method of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
