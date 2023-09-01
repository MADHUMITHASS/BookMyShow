package com.maddie.myspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maddie.myspringproject.model.User;
import com.maddie.myspringproject.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	@PostMapping("/save")
	public User saveTheUser(@RequestBody User user)
	{
		return userservice.saveUser(user);
	}
	
	@GetMapping("/get")
	public List<User> showTheUser()
	{
		return userservice.showUser();
	}
	@PutMapping("/update")
	public User updateTheUser(@RequestBody User user)
	{
		return userservice.updateUser(user);
	}

	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable int id)
	{
		userservice.deleteUSer(id);

	}

	@PutMapping("update/{id}")
	public String changeById(@PathVariable int id, @RequestBody User user)
	{
		return userservice.updateUserbyId(id, user);
	}
}
