package com.spacecoworking.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "space")
public class Space {
	
	@Id
	@Column(name="space_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;
	@Column(name = "address")
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


}
