package com.datasource.app.dto;

public class CargoDTO {

	//private long idCargo;
	
	private String nombre;

	private String area;
	
	private long idModalidad;

	public CargoDTO() {
		super();
	}
	
	public CargoDTO(String nombre, String area, long idModalidad) {
		super();
		this.nombre = nombre;
		this.area = area;
		this.idModalidad = idModalidad;
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

	public long getIdModalidad() {
		return idModalidad;
	}

	public void setIdModalidad(long idModalidad) {
		this.idModalidad = idModalidad;
	}
	//private EmpleadoModel empleado;

	//private ModalidadModel modalidad;	
}




