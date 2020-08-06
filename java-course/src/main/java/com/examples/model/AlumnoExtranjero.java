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

	public AlumnoExtranjero() {
		super();
	}
	
	public AlumnoExtranjero(String nombre, String apellidoPaterno, 
			String apellidoMaterno, String numeroLista,
			String paisOrigen) {
		super(nombre, apellidoPaterno, apellidoMaterno, numeroLista);

		this.paisOrigen = paisOrigen;
	}
	
	public static void main( String[] args ) {
		AlumnoExtranjero a = new AlumnoExtranjero( "Mexico" );
		AlumnoExtranjero b = new AlumnoExtranjero();
		AlumnoExtranjero c = new AlumnoExtranjero( "Juan", "Osorio", 
				"Alvarez", "28", "Mexico");
	}
}
