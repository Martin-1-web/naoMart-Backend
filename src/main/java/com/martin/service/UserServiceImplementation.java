package com.martin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.model.User;
import com.martin.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public User save(User user) {
		
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getMessage());
		return repository.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return repository.findAll();
	}
}
