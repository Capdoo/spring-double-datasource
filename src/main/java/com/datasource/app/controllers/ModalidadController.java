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

import com.datasource.app.dto.MensajeDTO;
import com.datasource.app.dto.ModalidadDTO;
import com.datasource.app.service.ModalidadService;

@RestController
@RequestMapping("/modalidades")
public class ModalidadController {

	@Autowired
	ModalidadService modalidadService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Object> registrar(@RequestBody ModalidadDTO modalidadDTO){
		
		modalidadService.save(modalidadDTO);
		return new ResponseEntity<Object>(new MensajeDTO("Modalidad registrada"), HttpStatus.OK);
	}
	
	@GetMapping("/obtener")
	public ResponseEntity<Object> obtener(){
		
		List<ModalidadDTO> modalidades = modalidadService.listar();
		return new ResponseEntity<Object>(modalidades, HttpStatus.OK);

	}
}
