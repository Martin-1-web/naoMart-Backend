package com.martin.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.martin.model.User;
import com.martin.service.EmailService;
import com.martin.service.UserService;

@RestController
@CrossOrigin(origins = {"https://nao-mart-frontend.vercel.app"})
public class UserController {
	
	private UserService service;
	
//	@Autowired
//	private EmailService emailService;
	
	
	@Autowired
	public void setService(UserService service) {
		this.service = service;
	}
	
	@PostMapping(value = {"/contact-details"}, produces = {"application/json"})
	public User saveUser(@RequestBody User user) {
		
//		emailService.sendMail("martindzeble@gmail.com");
		
		return service.save(user);
	}
	
	@GetMapping("/fetch-contact-details")
	public List<User> getAllUsers() {
		
		return service.findAll(); 
	}
	
}
