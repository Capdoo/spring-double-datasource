package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.ModalidadDTO;
import com.datasource.app.models.ModalidadModel;
import com.datasource.app.repositories.ModalidadRepository;

@Service
public class ModalidadService {


	@Autowired
	ModalidadRepository modalidadRepository;
	
	
	
	public void save(ModalidadDTO modalidadDTO) {
		ModalidadModel nuevaModalidad = new ModalidadModel();
			nuevaModalidad.setNombre(modalidadDTO.getNombre());
			nuevaModalidad.setHoras(modalidadDTO.getHoras());
			nuevaModalidad.setSueldo(modalidadDTO.getSueldo());
		modalidadRepository.save(nuevaModalidad);
	}
}
