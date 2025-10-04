package com.martin.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users")
public class User {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 50, nullable = false)
	private String email; 
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String message;

	public String getName() {return name;}
	
	public String getEmail() {return email;}
	
	public String getMessage() {return message;}
}
