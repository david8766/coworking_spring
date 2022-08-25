package com.spacecoworking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lastname")
	private String lastname;

	@Column(name = "firstname")
	private String firstname;
	@Column(name = "adresse")
	private String address;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private String phone;
	@Column(name = "role")
	private String role;
	
	@ManyToMany(mappedBy = "users")
	private List<Space> spaces;

}
