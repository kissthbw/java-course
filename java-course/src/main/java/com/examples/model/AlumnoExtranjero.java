package com.examples.model;

//Clase hija
public class AlumnoExtranjero extends Alumno {

	private String paisOrigen;

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public AlumnoExtranjero(String paisOrigen) {
		super("", "", "", "");

		this.paisOrigen = paisOrigen;
	}

	public AlumnoExtranjero(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroLista,
			String paisOrigen) {
		super(nombre, apellidoPaterno, apellidoMaterno, numeroLista);

		this.paisOrigen = paisOrigen;
	}
}
