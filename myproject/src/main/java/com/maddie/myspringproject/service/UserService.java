package com.maddie.myspringproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maddie.myspringproject.model.User;
import com.maddie.myspringproject.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;
	
	public User saveUser(User user)
	{
		return userrepository.save(user);
	}
	public List<User> showUser()
	{
		return userrepository.findAll();
	}
	public User updateUser(User user)
	{
		return userrepository.save(user);
	}
	public String updateUserbyId(int id, User user)
	{
		userrepository.save(user);
		if(userrepository.existsById(id))
		{
			return "The values are updated";
		}
		else
		{
			return "Please enter the valid id";
		}
	}
	public void deleteUSer(int id)
	{
		userrepository.deleteById(id);;
	}
	
}
