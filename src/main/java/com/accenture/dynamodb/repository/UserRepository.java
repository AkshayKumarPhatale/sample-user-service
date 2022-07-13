package com.accenture.dynamodb.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.accenture.dynamodb.entity.User;

@Repository
public class UserRepository  {
	 
	private List<User> users;
	
	
	 UserRepository() {
		users= new ArrayList<User>();
	}
	 
	 
	public User saveUser(User user) {
		users.add(user);
		return user;
		
	}
	
	public User getUserByEmail(String email) {
		
		return users.stream().filter(user->user.getEmail().equalsIgnoreCase(email)).findAny().get();
	}
	
	public List<User> getAllUsers(){
		
		return users;
	}
	 
	

}
