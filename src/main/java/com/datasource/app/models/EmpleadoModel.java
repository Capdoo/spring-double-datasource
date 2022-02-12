package com.datasource.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class EmpleadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private long idEmpleado;
	
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="direccion_id", referencedColumnName = "id_direccion")
	@JoinColumn(name="direccion_id", unique=true)
	//@Column(unique=true)
	private DireccionModel direccion;
	
	
	public EmpleadoModel() {
		super();
	}


	public EmpleadoModel(long idEmpleado, String apellidoPaterno, String apellidoMaterno, String nombres,
			DireccionModel direccion) {
		super();
		this.idEmpleado = idEmpleado;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.direccion = direccion;
	}


	public long getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public DireccionModel getDireccion() {
		return direccion;
	}


	public void setDireccion(DireccionModel direccion) {
		this.direccion = direccion;
	}

}
