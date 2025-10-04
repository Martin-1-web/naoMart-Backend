package com.martin.service;

import java.util.List;

import com.martin.model.User;

public interface UserService {

	User save(User user);
	List<User> findAll();
}
