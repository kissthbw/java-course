package com.examples.interfaceExamples;

public class PolloAnimal implements Animal {

	@Override
	public void sonido(String s) {
		System.out.println("pio pio");
	}

	@Override
	public void dormir(String d) {
		System.out.println("...ZzZz...pio");
	}

}
