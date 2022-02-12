package com.datasource.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="direcciones")
public class DireccionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private long id;
	
	private String calle;
	private String ciudad;
	private int numero;
	private int codigoPostal;
	
	@OneToOne(mappedBy = "direccion")
	private EmpleadoModel empleado;
	
	public DireccionModel() {
		super();
	}

	public DireccionModel(String calle, String ciudad, int numero, int codigoPostal, EmpleadoModel empleado) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.empleado = empleado;
	}
	
	/*
	public DireccionModel(long id, String calle, String ciudad, int numero, int codigoPostal, EmpleadoModel empleado) {
		super();
		this.id = id;
		this.calle = calle;
		this.ciudad = ciudad;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.empleado = empleado;
	}
*/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public EmpleadoModel getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoModel empleado) {
		this.empleado = empleado;
	}
	
	
}
