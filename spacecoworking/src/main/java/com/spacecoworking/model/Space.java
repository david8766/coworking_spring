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
@Table(name = "space")
public class Space {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;
	@Column(name = "adress")
	private String address;
	@Column(name = "zipcode")
	private String zipcode;
	@Column(name = "city")
	private String city;
	@Column(name = "web")
	private String web;
	@Column(name = "location")
	private String location;
	@Column(name = "epci")
	private String epci;
	@Column(name = "department")
	private String department;
	@Column(name = "region")
	private String region;

	@ManyToMany
	private List<User> users;

}
