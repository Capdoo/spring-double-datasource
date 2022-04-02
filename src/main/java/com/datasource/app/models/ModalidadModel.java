package com.datasource.app.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	
	@OneToMany(cascade =  CascadeType.ALL,mappedBy = "modalidad")
	private Set<PuestoModel> puesto;

	public ModalidadModel() {
		super();
	}
	
	public ModalidadModel(long idModalidad, String nombre, int horas, double sueldo, Set<PuestoModel> puesto) {
		super();
		this.idModalidad = idModalidad;
		this.nombre = nombre;
		this.horas = horas;
		this.sueldo = sueldo;
		this.puesto = puesto;
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

	public Set<PuestoModel> getPuesto() {
		return puesto;
	}

	public void setPuesto(Set<PuestoModel> puesto) {
		this.puesto = puesto;
	}

	
}





