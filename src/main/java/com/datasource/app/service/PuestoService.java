package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.PuestoDTO;
import com.datasource.app.models.PuestoModel;
import com.datasource.app.models.ModalidadModel;
import com.datasource.app.repositories.PuestoRepository;
import com.datasource.app.repositories.ModalidadRepository;

@Service
public class PuestoService {

	@Autowired
	ModalidadRepository modalidadRepository;
	
	@Autowired
	PuestoRepository cargoRepository;
	
	
	public void save(PuestoDTO puestoDTO) {
		
		ModalidadModel modalidad = modalidadRepository.findById(puestoDTO.getIdModalidad()).get();
		
		PuestoModel nuevoCargo = new PuestoModel();
			nuevoCargo.setArea(puestoDTO.getArea());
			nuevoCargo.setNombre(puestoDTO.getNombre());
			nuevoCargo.setModalidad(modalidad);
	}
	
}
