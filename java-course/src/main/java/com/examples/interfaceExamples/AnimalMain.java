package com.examples.interfaceExamples;

public class AnimalMain {

	public static void main(String[] args) {

		Animal perro = new PerroAnimal();
		perro.sonido(null);
		perro.dormir(null);

		Animal gato = new GatoAnimal();
		gato.sonido(null);
		gato.dormir(null);

		Animal pollo = new PolloAnimal();
		pollo.sonido(null);
		pollo.dormir(null);

		Animal gallo = new GalloAnimal();
		gallo.sonido(null);
		gallo.dormir(null);
	}
}
