package com.examples.clazz;

public class Client {

	private String nombre;
	private String paterno;
	private String materno;
	private String edad;
	private String cuenta;
	private String email;
	private String area;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (paterno != null) {
			builder.append("paterno=");
			builder.append(paterno);
			builder.append(", ");
		}
		if (materno != null) {
			builder.append("materno=");
			builder.append(materno);
			builder.append(", ");
		}
		if (edad != null) {
			builder.append("edad=");
			builder.append(edad);
			builder.append(", ");
		}
		if (cuenta != null) {
			builder.append("cuenta=");
			builder.append(cuenta);
			builder.append(", ");
		}
		if (email != null) {
			builder.append("email=");
			builder.append(email);
			builder.append(", ");
		}
		if (area != null) {
			builder.append("area=");
			builder.append(area);
		}
		builder.append("]");
		return builder.toString();
	}
}