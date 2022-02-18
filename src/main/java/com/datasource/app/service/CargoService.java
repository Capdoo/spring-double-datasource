package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.CargoDTO;
import com.datasource.app.models.CargoModel;
import com.datasource.app.models.ModalidadModel;
import com.datasource.app.repositories.CargoRepository;
import com.datasource.app.repositories.ModalidadRepository;

@Service
public class CargoService {

	@Autowired
	ModalidadRepository modalidadRepository;
	
	@Autowired
	CargoRepository cargoRepository;
	
	
	public void save(CargoDTO cargoDTO) {
		
		ModalidadModel modalidad = modalidadRepository.findById(cargoDTO.getIdModalidad()).get();
		
		CargoModel nuevoCargo = new CargoModel();
			nuevoCargo.setArea(cargoDTO.getArea());
			nuevoCargo.setNombre(cargoDTO.getNombre());
			nuevoCargo.setModalidad(modalidad);
	}
	
}
