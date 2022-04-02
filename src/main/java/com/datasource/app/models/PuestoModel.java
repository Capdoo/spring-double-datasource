package com.datasource.app.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="puestos")
public class PuestoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_puesto")
	private long idCargo;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="area")
	private String area;
	
	@OneToMany(cascade =  CascadeType.ALL, mappedBy = "puesto")
	private Set<EmpleadoModel> empleados;

	@ManyToOne
    @JoinColumn(name = "modalidad_id", referencedColumnName = "id_modalidad", nullable = false, foreignKey = @ForeignKey(name = "PUESTO_FK_MODALIDAD"))
	private ModalidadModel modalidad;

	public PuestoModel() {
		super();
	}
	
	public PuestoModel(long idCargo, String nombre, String area, Set<EmpleadoModel> empleados,
			ModalidadModel modalidad) {
		super();
		this.idCargo = idCargo;
		this.nombre = nombre;
		this.area = area;
		this.empleados = empleados;
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

	public Set<EmpleadoModel> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<EmpleadoModel> empleados) {
		this.empleados = empleados;
	}

	public ModalidadModel getModalidad() {
		return modalidad;
	}

	public void setModalidad(ModalidadModel modalidad) {
		this.modalidad = modalidad;
	}

}











