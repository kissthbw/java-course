package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

	/*
	 * Datos primitivos y su valor por default byte = 0 short = 0 boolean = false
	 * int = 0 long = 0 double = 0.0 float = 0.0 char = ''
	 */

	//
	// Campos de instancia
	private List<String> ingredients = new ArrayList<>();
	private double precio = 0.0;
	private String tamanio;
	private String tipoCarne;
	private String terminoCarne;
	private String tipoPan;
	private String nombreHamburguesa;
	private char ranking;

	// Constructor default
	public Hamburger() {
		// TODO: @Adrian pon un mensaje imprimiendo todas las propiedades o campos y sus
		// valores
	}

	public Hamburger(List<String> ingredients, double precio) {
		// TODO: @Adrian complementa este contrcutor agregando n parametros segun la
		// cantidad de campos que tengas
		// y tambien muestra un mensaje
		this.ingredients = ingredients;
		this.precio = precio;
	}

	// Methodo
	// TODO: @Adrian: Agregar los metodos set y get que hagan falta

	// Metodos set

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
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

	public char getRanking() {
		return ranking;
	}

	// Metodos get

	public List<String> getIngredients() {
		return ingredients;
	}

	public double getPrecio() {
		return precio;
	}

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

	public void setRanking(char ranking) {
		this.ranking = ranking;
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
