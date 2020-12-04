package com.javaproject.mentalillnessdetector.controller;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.mentalillnessdetector.model.User;
import com.javaproject.mentalillnessdetector.repository.UserRepository;
//@CrossOrigin(origins="http://localhost:3000/")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/login/")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsers(){
		 

		return userRepository.findAll();
	}
	//creating user API
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
