package com.spacecoworking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "reservationDuration"  )
	private int reservationDuration;
	@Column(name = "starDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	@Column(name = "amount")
	private float amount;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "space_id")
    private Space space;
   

}
