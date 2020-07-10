package com.examples.flowcontrol;

public class Operaciones {

	// TODO: Adrian crea una clase en el paquete com.examples.flowcontrol
	// que se llama Operaciones, y que tenga un metodo que se llama mostrarTabla,
	// y que tenga como parametro la base de la tabla a mostar que vaya de 1 a 50
	// hacer este metodo con for, while y do while

	public void mostrarTabla(int base) {

		System.out.println("Usando For");
		for (int i = 1; i <= 50; i++) {
			int r = base * i;
			System.out.println(base + " x " + i + " = " + r);
		}
	}

	public void mostrarTabla1(int base) {

		System.out.println("Usando While");
		int i = 1;
		while (i <= 50) {
			int r = base * i;
			System.out.println(base + " x " + i + " = " + r);
			i++;
		}
	}

	public void mostarTabla2(int base) {

		System.out.println("Usando Do While");
		int i = 1;
		int r = 0;
		do {
			r = base * i;
			System.out.println(base + " x " + i + " = " + r);
			i++;
		} while (i <= 50);
	}

	public static void main(String[] args) {

		Operaciones o = new Operaciones();
		int numero = 3;
		o.mostrarTabla(numero);
		o.mostrarTabla1(numero);
		o.mostarTabla2(numero);
	}
}
