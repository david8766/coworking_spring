package com.spacecoworking.service;



import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spacecoworking.model.User;
import com.spacecoworking.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void getNull() {
		return;
	}
	
	public User findById(Integer id) {
		return this.userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}
	
	public User checkUser(String email,String password) {
		return this.userRepository.checkUser(email,password);
	}
	
	public Page<User> findAll(Pageable pageable) {
		
		return this.userRepository.findAll(pageable);
	}
	
	public User create(User userToCreate) {
		return this.userRepository.save(userToCreate);
	}
	
	public User update(User userToUpdate) {
		return this.userRepository.save(userToUpdate);
	}
	public void delete(Integer id) {
		this.userRepository.deleteById(id);
	}
}
