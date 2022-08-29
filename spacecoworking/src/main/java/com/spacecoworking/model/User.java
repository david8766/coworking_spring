package com.spacecoworking.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "address")
	private String address;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private String phone;
	@Column(name = "role")
	private String role;
	
	

}
