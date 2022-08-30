package com.spacecoworking.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="user")
	private List<Reservation> reservation;
	
	public User() {
		super();
	}

	public User(int id, String lastname, String firstname, String address, String zipcode, String city, String phone,
			String role, List<Reservation> reservation) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.phone = phone;
		this.role = role;
		this.reservation = reservation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	
	
	
	

}
