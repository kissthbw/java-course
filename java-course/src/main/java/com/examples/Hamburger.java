package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

	// Campos, variables o propiedades
	private List<String> ingredients = new ArrayList<>();
	private double precio;
	private String tamanio;
	private String tipoCarne;
	private String terminoCarne;
	private String tipoPan;
	private String nombreHamburguesa;

	// Constructor default
	public Hamburger() {
	}

	public Hamburger(List<String> ingredients, double precio) {
		this.ingredients = ingredients;
		this.precio = precio;
	}

	// Methodo
	// TODO: @Adrian: Agregar los metodos set y get que hagan falta

	// Metodos set

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void setTipoCarne(String tipoCarne) {
		this.terminoCarne = tamanioCarne;
	}

	public void setTerminoCarne(String terminoCarne) {
		this.terminoCarne = terminoCarne;
	}

	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}

	public void setNombreHamburguesa(String nombreHamburguesa) {
		this.nombreHamburguesa = nombreHamburguesa;
	}

	// Metodos get

	public String getTamanio() {
		return tamanio;
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public String getTerminoCarne() {
		return terminoCarne;
	}

	public String getTipoPan() {
		return tipoPan;
	}

	public String getNombreHamburguesa() {
		return nombreHamburguesa;
	}

	// TODO: Agregar un metodo que se llama prepareHamburger

	public void preparingHamburger() {
		System.out.println("Cocinando carne...");
		System.out.println("Calentando pan...");
		System.out.println("Zazonando ingredientes...");
		System.out.println("Armando hamburguesa...");

		System.out.println("Lista para empacar...");
	}

	public void packageHamburger() {
		System.out.println("Recibiendo hamburguesa...");
		System.out.println("Empapelando hamburguesa...");
		System.out.println("Empaquetanto hamburguesa...");

		System.out.println("Lista para entregar");
	}

}
