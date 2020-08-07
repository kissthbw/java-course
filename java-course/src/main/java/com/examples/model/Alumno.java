package com.examples.model;

//Clase base
public class Alumno {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String numeroLista;
	private double promedioGeneral;

	// Adrian termina los metodos set y get, tanto de esta clase
	// como de la clase hija

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

	public String getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(String numeroLista) {
		this.numeroLista = numeroLista;
	}

	public double getPromedioGeneral() {
		return promedioGeneral;
	}

	public void setPromedioGeneral(double promedioGeneral) {
		this.promedioGeneral = promedioGeneral;
	}

	// Crea una clase que se llame AlumnoBecado que herede de Alumno
	// y que tenga las propiedades de porcentaje de beca y periodo de validez de
	// beca

	// Crea 10 ejemplos de clase padre y clase hijo con sus respectivas propiedades,
	// metodos y constructores.

	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidoPaterno, 
			String apellidoMaterno, String numeroLista) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numeroLista = numeroLista;

	}

	public static void main(String[] args) {
		Alumno a = new Alumno("Juan", "Osorio", "Alvarez", "28");
	}
}
