package com.spacecoworking.repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spacecoworking.model.Space;

public interface SpaceRepository extends JpaRepository<Space,Integer> {
	public List<Space> findByCity(String city );
	
	Page<Space> findAll(Pageable pageable);
}
