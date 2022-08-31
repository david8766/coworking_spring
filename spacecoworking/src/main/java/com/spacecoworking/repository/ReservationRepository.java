package com.spacecoworking.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spacecoworking.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	
	@Query("SELECT p from Reservation p where p.user.id=:userid")	
	Iterable<Reservation> findAllReservationByUserId(Integer userid);
}
