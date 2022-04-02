package com.datasource.app.dto;

public class EmpleadoDTO {

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	private long idDireccion;
	private long idPuesto;

	public EmpleadoDTO() {
		super();
	}

	public EmpleadoDTO(String nombre, String apellidoPaterno, String apellidoMaterno, long idDireccion, long idPuesto) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.idDireccion = idDireccion;
		this.idPuesto = idPuesto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public long getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(long idPuesto) {
		this.idPuesto = idPuesto;
	}

	
}
