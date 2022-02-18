package com.datasource.app.dto;

public class ModalidadDTO {

	//private long idModalidad;
	
	private String nombre;
	
	private int horas;
	
	private double sueldo;
	
	//private CargoModel cargo;

	public ModalidadDTO() {
		super();
	}
	
	public ModalidadDTO(String nombre, int horas, double sueldo) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.sueldo = sueldo;
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

	
}
