package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.DireccionDTO;
import com.datasource.app.models.DireccionModel;
import com.datasource.app.repositories.DireccionRepository;

@Service
public class DireccionService {

	
	@Autowired
	DireccionRepository direccionRepository;
	
	
	public void save(DireccionDTO direccionDTO) {
		DireccionModel direccionNueva = new DireccionModel();
			direccionNueva.setCalle(direccionDTO.getCalle());
			direccionNueva.setCiudad(direccionDTO.getCiudad());
			direccionNueva.setCodigoPostal(direccionDTO.getCodigoPostal());
			direccionNueva.setNumero(direccionDTO.getNumero());
		direccionRepository.save(direccionNueva);
	}
	
}
