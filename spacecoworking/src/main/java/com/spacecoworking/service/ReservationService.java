package com.spacecoworking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spacecoworking.model.Reservation;
import com.spacecoworking.repository.ReservationRepository;
import com.spacecoworking.repository.UserRepository;

@Service
public class ReservationService {
	@Autowired
	public ReservationRepository reservationRepository;
	public UserRepository userRepository;
	
	public Reservation create(Reservation reservationToCreate) {
		return this.reservationRepository.save(reservationToCreate);
	}
	/*
	public List<Reservation> findAllReservationByUserId(Integer user_id){
		
		return this.reservationRepository.findAllReservationByUserId(user_id);
	
	}*/
	public void delete(Integer reservation_id) {
		this.reservationRepository.deleteById(reservation_id);
	}
}
