package com.datasource.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datasource.app.dto.EmpleadoDTO;
import com.datasource.app.models.DireccionModel;
import com.datasource.app.models.EmpleadoModel;
import com.datasource.app.models.PuestoModel;
import com.datasource.app.repositories.DireccionRepository;
import com.datasource.app.repositories.EmpleadoRepository;
import com.datasource.app.repositories.PuestoRepository;

@Service
public class EmpleadoService {

	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	DireccionRepository direccionRepository;
	
	@Autowired
	PuestoRepository puestoRepository;
	
	public void save(EmpleadoDTO empleadoDTO) {
	
		DireccionModel direccionElegida = direccionRepository.getById(empleadoDTO.getIdDireccion());
		PuestoModel puestoElegido = puestoRepository.getById(empleadoDTO.getIdPuesto());

		EmpleadoModel empleadoNuevo = new EmpleadoModel();
			empleadoNuevo.setApellidoMaterno(empleadoDTO.getApellidoMaterno());
			empleadoNuevo.setApellidoPaterno(empleadoDTO.getApellidoPaterno());
			empleadoNuevo.setNombres(empleadoDTO.getNombre());
			
			empleadoNuevo.setDireccion(direccionElegida);
			empleadoNuevo.setPuesto(puestoElegido);
			
		empleadoRepository.save(empleadoNuevo);
	}
	
	public List<EmpleadoDTO> obtener(){
		List<EmpleadoDTO> listaEmpleados = new ArrayList<>();
		List<EmpleadoModel> listaEmpleadosModel = empleadoRepository.findAll();
		
		for(EmpleadoModel p: listaEmpleadosModel){
			EmpleadoDTO empleadoDTO = new EmpleadoDTO();
				empleadoDTO.setApellidoPaterno(p.getApellidoPaterno());
				empleadoDTO.setApellidoMaterno(p.getApellidoMaterno());
				empleadoDTO.setNombre(p.getNombres());
				empleadoDTO.setIdDireccion(Integer.parseInt(p.getDireccion().getIdDireccion()+""));
				empleadoDTO.setIdPuesto(p.getPuesto().getIdCargo());
			listaEmpleados.add(empleadoDTO);
		}
		
		return listaEmpleados;
	}
	
	
}





















