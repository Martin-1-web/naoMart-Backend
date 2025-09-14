package com.martin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.martin.model.User;
import com.martin.model.UserService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value = {"/user"}, produces = {"application/json"})
	public User saveUser(@RequestBody User user) {
		

		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getMessage());
		return service.save(user);
	}
}
