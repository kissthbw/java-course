package com.examples.model;

//Clase base
public class Alumno {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String numeroLista;
	private double promedioGeneral;
	
	//Adrian termina los metodos set y get, tanto de esta clase
	//como de la clase hija
	
	//Crea una clase que se llame AlumnoBecado que herede de Alumno
	//y que tenga las propiedades de porcentaje de beca y periodo de validez de beca
	
	//Crea 10 ejemplos de clase padre y clase hijo con sus respectivas propiedades,
	//metodos y constructores.
	
	
	public Alumno( String nombre, String apellidoPaterno, 
			String apellidoMaterno, String numeroLista ) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public static void main( String[] args ) {
		Alumno a = new Alumno( "Juan", "Osorio", "", "" );
	}
}
