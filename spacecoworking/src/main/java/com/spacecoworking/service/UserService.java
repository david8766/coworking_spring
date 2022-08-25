package com.spacecoworking.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacecoworking.model.User;
import com.spacecoworking.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User findById(Integer id) {
		return this.userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public User create(User userToCreate) {
		return this.userRepository.save(userToCreate);
	}
}
