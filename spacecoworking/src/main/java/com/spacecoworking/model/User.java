package com.spacecoworking.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lastname")
	private String lastname;

	@Column(name = "firstnale")
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
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Reservation", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "space_id") })
	List<Space> spaces;

}
