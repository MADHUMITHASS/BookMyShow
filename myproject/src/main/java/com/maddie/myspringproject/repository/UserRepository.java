package com.maddie.myspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddie.myspringproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
