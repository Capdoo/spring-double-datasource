package com.datasource.app.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<DireccionDTO> obtener(){
		List<DireccionDTO> direcciones = new ArrayList<>();
		List<DireccionModel> direccionesModel = direccionRepository.findAll();
		
		for(DireccionModel p: direccionesModel) {
			DireccionDTO direccionDTO = new DireccionDTO();
				direccionDTO.setCalle(p.getCalle());
				direccionDTO.setCiudad(p.getCiudad());
				direccionDTO.setCodigoPostal(p.getCodigoPostal());
				direccionDTO.setNumero(p.getNumero());
			direcciones.add(direccionDTO);
		}
		
		return direcciones;
	}
	
}



