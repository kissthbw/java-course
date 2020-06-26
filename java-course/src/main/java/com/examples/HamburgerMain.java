package com.examples;

public class HamburgerMain {

	/*
	 * El metodo main sirve como puerta de entrada para que la maquina virtual
	 * ejecute nuestro programa
	 */

	// Forma 1
//	public static void main( String[] args ) {
//		
//	}

	// Forma 2
//	public static void main( String args[] ) {
//		
//	}

	// Forma 3
	public static void main(String... args) {
		Hamburger h1 = new Hamburger();
		h1.setNombreHamburguesa("Doble carne");
		h1.setTipoPan("Pan de ajo");
		h1.setTipoCarne("Arrachera marinada");
		h1.setTamanio("Mediana");
		h1.setPrecio(75.50);
		h1.setTerminoCarne("En su punto");

		Hamburger h2 = new Hamburger();
		h2.setNombreHamburguesa("Mexicana");
		h2.setTipoPan("Pan de chile");
		h2.setTipoCarne("Carne molida con especies");
		h2.setTamanio("Grande");
		h2.setPrecio(98.50);
		h2.setTerminoCarne("En su punto");

		System.out.println("Hamburguesa: " + h1.getNombreHamburguesa());
		h1.packageHamburger();
		
		System.out.println("\n" + "Hamburguesa: " + h2.getNombreHamburguesa());
		h1.preparingHamburger();
	}
}
