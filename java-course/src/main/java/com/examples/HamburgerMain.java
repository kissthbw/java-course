package com.examples;

public class HamburgerMain {
	
	/*
	 * El metodo main sirve como puerta de entrada para que la maquina virtual
	 * ejecute nuestro programa
	 */
	
	//Forma 1
//	public static void main( String[] args ) {
//		
//	}
	
	//Forma 2
//	public static void main( String args[] ) {
//		
//	}
	
	//Forma 3
	public static void main( String... args ) {
		Hamburger h1 = new Hamburger();
		h1.setNombreHamburguesa("Doble carne");
		
		Hamburger h2 = new Hamburger();
		
	}
}
