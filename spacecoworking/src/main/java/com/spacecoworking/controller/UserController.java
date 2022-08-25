package com.spacecoworking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spacecoworking.model.User;
import com.spacecoworking.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User findOne(@PathVariable("id") Integer id) {
		return this.userService.findById(id);
	}
	
	@PostMapping("/user/create")
	public User createSpecies(@RequestBody User userToCreate) {
		return this.userService.create(userToCreate);
	}
}
