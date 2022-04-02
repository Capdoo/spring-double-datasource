package com.datasource.app.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.ForeignKey;

@Entity
@Table(name="empleados")
public class EmpleadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpleado;
	
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombres;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "direccion_id", nullable = false, foreignKey = @ForeignKey(name = "USUARIO_FK_DIRECCION"))
	private DireccionModel direccion;
	
	@ManyToOne //(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "puesto_id", referencedColumnName="id_puesto", nullable = false, foreignKey = @ForeignKey(name = "USUARIO_FK_CARGO"))
	private PuestoModel puesto;
	
	
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


	public PuestoModel getPuesto() {
		return puesto;
	}


	public void setPuesto(PuestoModel puesto) {
		this.puesto = puesto;
	}

	
	
}
