package com.martin.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.martin.demo.model.Contact;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ContactController {
 
	@PostMapping(value = {"/contact"}, produces = "application/json")
	public Map<String, Object> handleContact(@RequestBody Contact contact) {
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("message", "Data Received Succeffully");
		response.put("name", contact.getName());
		
		System.out.println(contact.getName());
		
		return response;
	}
}
