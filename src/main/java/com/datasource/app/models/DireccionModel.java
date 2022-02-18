package com.datasource.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="direcciones")
public class DireccionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private long idDireccion;
	
	private String calle;
	private String ciudad;
	private int numero;
	private int codigoPostal;
	
	@OneToOne(cascade =  CascadeType.ALL,mappedBy = "direccion")
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


	public String getCalle() {
		return calle;
	}

	public long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(long idDireccion) {
		this.idDireccion = idDireccion;
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
