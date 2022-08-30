package com.spacecoworking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;

import com.spacecoworking.model.Space;
import com.spacecoworking.repository.SpaceRepository;

@Service
public class SpaceService {
	
	private static final int LIMIT = 10;
	@Autowired

	public SpaceRepository spaceRepository;

	public List<Space> findByCity(String city) {

		return this.spaceRepository.findByCity(city);

	}

	public Page<Space> findAll(Pageable pageable) {

		return this.spaceRepository.findAll(pageable);
	}

	public List<Space> getAllLimited() {

		Page<Space> page = spaceRepository.findAll(PageRequest.of(0, LIMIT));
		return page.getContent();

	}
}
