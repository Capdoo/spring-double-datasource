package com.datasource.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="puestos")
public class PuestoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cargo")
	private long idCargo;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="area")
	private String area;
	
	@OneToOne(cascade =  CascadeType.ALL,mappedBy = "cargo")
	private EmpleadoModel empleado;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "modalidad_id", nullable = false, foreignKey = @ForeignKey(name = "PUESTO_FK_MODALIDAD"))
	private ModalidadModel modalidad;

	public PuestoModel() {
		super();
	}

	public PuestoModel(String nombre, String area, EmpleadoModel empleado, ModalidadModel modalidad) {
		super();
		this.nombre = nombre;
		this.area = area;
		this.empleado = empleado;
		this.modalidad = modalidad;
	}

	public long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(long idCargo) {
		this.idCargo = idCargo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public EmpleadoModel getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoModel empleado) {
		this.empleado = empleado;
	}

	public ModalidadModel getModalidad() {
		return modalidad;
	}

	public void setModalidad(ModalidadModel modalidad) {
		this.modalidad = modalidad;
	}

}











