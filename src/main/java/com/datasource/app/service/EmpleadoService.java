package com.datasource.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.EmpleadoDTO;
import com.datasource.app.models.DireccionModel;
import com.datasource.app.models.EmpleadoModel;
import com.datasource.app.repositories.DireccionRepository;
import com.datasource.app.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	DireccionRepository direccionRepository;
	
	public void save(EmpleadoDTO empleadoDTO) {
		
		DireccionModel direccionElegida = direccionRepository.getById(empleadoDTO.getIdDireccion());
		EmpleadoModel empleadoNuevo = new EmpleadoModel();
			empleadoNuevo.setApellidoMaterno(empleadoDTO.getApellidoMaterno());
			empleadoNuevo.setApellidoPaterno(empleadoDTO.getApellidoPaterno());
			empleadoNuevo.setNombres(empleadoDTO.getNombre());
			empleadoNuevo.setDireccion(direccionElegida);
		
			
		empleadoRepository.save(empleadoNuevo);
	}
	
	
}
