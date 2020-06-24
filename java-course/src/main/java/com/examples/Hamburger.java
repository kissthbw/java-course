package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Hamburger{
	
	//Campos, variables o propiedades
	private List<String> ingredients = new ArrayList<>(); 
	private double precio;
	
	
	//Constructor default
	public Hamburger() {
	}
	
	public Hamburger( List<String> ingredients, double precio ) {
		this.ingredients = ingredients;
		this.precio = precio;
	}
	
	//Methodo
	//TODO: @Adrian: Agregar los metodos set y get que hagan falta
	
	//TODO: Agregar un metodo que se llama prepareHamburger
	
	public void packageHamburger() {
		System.out.println( "Recibiendo hamburguesa..." );
		System.out.println( "Empapelando hamburguesa..." );
		System.out.println( "Empaquetanto hamburguesa..." );
		
		System.out.println( "Lista para entregar" );
	}
	
}
