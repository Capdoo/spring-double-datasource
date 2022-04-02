package com.datasource.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datasource.app.dto.MensajeDTO;
import com.datasource.app.dto.PuestoDTO;
import com.datasource.app.service.PuestoService;

@RestController
@RequestMapping("/puestos")
public class PuestosController {

	
	@Autowired
	PuestoService puestoService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Object> registrar(@RequestBody PuestoDTO puestoDTO){
		puestoService.save(puestoDTO);
		return new ResponseEntity<Object>(new MensajeDTO("Puesto registrado"), HttpStatus.OK);
	
	}
}







