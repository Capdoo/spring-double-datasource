package com.datasource.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datasource.app.dto.EmpleadoDTO;
import com.datasource.app.dto.MensajeDTO;
import com.datasource.app.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Object> ingresar(@RequestBody EmpleadoDTO empleado){
		
		empleadoService.save(empleado);
		
		return new ResponseEntity<Object>(new MensajeDTO("Empleado(a) registrado(a)"),HttpStatus.OK);
	}
	
	@GetMapping("/obtener")
	public ResponseEntity<Object> obtener(){
		List<EmpleadoDTO> listaEmpleados = empleadoService.obtener();
		return new ResponseEntity<Object>(listaEmpleados,HttpStatus.OK);
	}
	
}
