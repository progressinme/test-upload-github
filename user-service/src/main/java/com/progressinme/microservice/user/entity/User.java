package com.progressinme.service.user.entity;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	private String userFirstName;
	private String userLastName;
	private String userAddress;
	private String userEmail;
	private Long departmentId;
}
