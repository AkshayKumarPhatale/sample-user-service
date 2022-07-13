package com.accenture.dynamodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.dynamodb.entity.User;
import com.accenture.dynamodb.repository.UserRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@ApiOperation(value = "save an employee",notes = "This method is for saving employee object to the db")
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		
		return userRepository.saveUser(user);
		
	}
	
	@ApiOperation(value = "save an employee",notes = "This method is for saving employee object to the db")
	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable("email") String email) {
		
		return userRepository.getUserByEmail(email);
	}
	
	@ApiOperation(value = "save an employee",notes = "This method is for saving employee object to the db")
	@GetMapping("/getall")
	public List<User> getAllUsers(){
		
		return userRepository.getAllUsers();
	}
	
	

}
