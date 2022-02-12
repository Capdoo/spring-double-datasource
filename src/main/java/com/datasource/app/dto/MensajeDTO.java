package com.datasource.app.dto;

public class MensajeDTO {

	private String mensaje;

	public MensajeDTO(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public MensajeDTO() {
		super();
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
