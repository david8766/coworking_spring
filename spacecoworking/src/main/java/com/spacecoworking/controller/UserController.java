package com.spacecoworking.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spacecoworking.model.User;
import com.spacecoworking.service.UserService;


@RestController
@RequestMapping("/rest/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/{id}")
	public User findOne(@PathVariable("id") Integer id) {
		return this.userService.findById(id);
	}
	
	@GetMapping("/{email}/{password}")
	public User checkUser(@PathVariable("email") String email, @PathVariable("password") String password) {
		return this.userService.checkUser(email, password);
	}
	
	@GetMapping
	public Page<User> findAll(Pageable pageable) {
		return this.userService.findAll(pageable);
	}
	
	@PostMapping
	public User createUser(@RequestBody @Valid User userToCreate) {
		System.out.println(userToCreate.toString());
		return this.userService.create(userToCreate);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User updateUser) {
		return this.userService.update(updateUser);
	}
	@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer user_id) {
        this.userService.delete(user_id);
    }
}