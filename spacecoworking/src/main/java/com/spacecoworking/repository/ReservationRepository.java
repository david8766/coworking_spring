package com.spacecoworking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spacecoworking.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	
	@Query("SELECT r FROM reservation r WHERE r.user_id = ?1")
	List<Reservation> findAllReservationByUserId(Integer id);

}
