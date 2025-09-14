package com.martin.service;

import org.springframework.stereotype.Service;

import com.martin.model.User;
import com.martin.model.UserService;

@Service
public class UserServiceImplementation implements UserService {

	@Override
	public User save(User user) {
		user.getName();
		user.getEmail();
		user.getMessage();
		return user;
	}

}
