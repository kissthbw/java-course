package com.examples.interfaceExamples;

public class GatoAnimal implements Animal {

	@Override
	public void sonido(String s) {
		System.out.println("miaw");
	}

	@Override
	public void dormir(String d) {
		System.out.println("...ZzZzZ...miaw");
	}

}
