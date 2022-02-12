package com.datasource.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datasource.app.dto.DireccionDTO;
import com.datasource.app.dto.MensajeDTO;
import com.datasource.app.service.DireccionService;

@RestController
public class DireccionController {

	
	@Autowired
	DireccionService direccionService;
	
	@PostMapping("/direcciones")
	public ResponseEntity<Object> registrar(@RequestBody DireccionDTO direccion){
		
		direccionService.save(direccion);
		
		return new ResponseEntity<Object>(new MensajeDTO("Direccion registrada"),HttpStatus.OK);
	}
	
	
}
