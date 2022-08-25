package com.spacecoworking.repository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spacecoworking.model.User;

@RestController
@RequestMapping("/rest")
public interface UserRepository extends JpaRepository<User, Integer> {

}
