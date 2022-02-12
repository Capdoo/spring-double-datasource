package com.datasource.app.dto;

public class DireccionDTO {
	
	private String calle;
	private String ciudad;
	private int numero;
	private int codigoPostal;
	
	public DireccionDTO() {
		super();
	}
	
	public DireccionDTO(String calle, String ciudad, int numero, int codigoPostal) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
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

	
	
}
