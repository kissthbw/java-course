package com.examples.interfaceExamples;

public class GalloAnimal implements Animal {

	@Override
	public void sonido(String s) {
		System.out.println("kikiriki");
	}

	@Override
	public void dormir(String d) {
		System.out.println("...zZzZzZ...");
	}

}
