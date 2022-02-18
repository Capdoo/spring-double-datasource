package com.datasource.app.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.datasource.app.models.EmpleadoModel;
import com.datasource.app.models.ModalidadModel;

public class CargoDTO {


	//private long idCargo;
	

	private String nombre;


	private String area;
	
	//private EmpleadoModel empleado;

	//private ModalidadModel modalidad;
	
}




