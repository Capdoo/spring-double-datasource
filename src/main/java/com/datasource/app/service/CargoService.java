package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.repositories.CargoRepository;

@Service
public class CargoService {

	@Autowired
	CargoRepository cargoRepository;
	
	
	public void save(CargoDTO cargoDTO) {
		
	}
	
}
