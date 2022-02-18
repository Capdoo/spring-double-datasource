package com.datasource.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="modalidades")
public class ModalidadModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_modalidad")
	private long idModalidad;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="horas")
	private int horas;
	
	@Column(name="sueldo")
	private double sueldo;
	
	@OneToOne(cascade =  CascadeType.ALL,mappedBy = "modalidad")
	private CargoModel cargo;

	public ModalidadModel() {
		super();
	}

	public ModalidadModel(String nombre, int horas, double sueldo, CargoModel cargo) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.sueldo = sueldo;
		this.cargo = cargo;
	}
	
	public long getIdModalidad() {
		return idModalidad;
	}

	public void setIdModalidad(long idModalidad) {
		this.idModalidad = idModalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public CargoModel getCargo() {
		return cargo;
	}

	public void setCargo(CargoModel cargo) {
		this.cargo = cargo;
	}

	
}





