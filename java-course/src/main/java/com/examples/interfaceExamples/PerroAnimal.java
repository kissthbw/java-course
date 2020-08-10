package com.examples.interfaceExamples;

public class PerroAnimal implements Animal {

	@Override
	public void sonido(String s) {
		System.out.println("guauf");
	}

	@Override
	public void dormir(String d) {
		System.out.println("...zZzZz...guauf");
	}

}
