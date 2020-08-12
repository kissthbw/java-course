package com.examples.clazz;

import java.io.File;

public class Client {

	private String nombre;
	private String paterno;
	private String materno;
	private String edad;
	private String cuenta;
	private String email;
	private String area;

	// Metodos set y get de las propiedades de la clase Client
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	// Constructores
	public Client() {
		this.init();
	}

	public void init() {
		this.nombre = "";
		this.paterno = "";
		this.materno = "";
		this.edad = "";
		this.cuenta = "";
		this.email = "";
		this.area = "";
	}
}
