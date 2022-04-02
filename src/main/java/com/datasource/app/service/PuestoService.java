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
	PuestoRepository puestoRepository;
	
	
	public void save(PuestoDTO puestoDTO) {
		
		long idObtenido = puestoDTO.getIdModalidad();
		System.out.println(idObtenido);
		
		ModalidadModel modalidad = modalidadRepository.findById(idObtenido).get();
		
		PuestoModel nuevoPuesto = new PuestoModel();
			nuevoPuesto.setArea(puestoDTO.getArea());
			nuevoPuesto.setNombre(puestoDTO.getNombre());
			nuevoPuesto.setModalidad(modalidad);
		puestoRepository.save(nuevoPuesto);
		
	}
	
}
