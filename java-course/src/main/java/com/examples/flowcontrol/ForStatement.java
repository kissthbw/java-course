package com.examples.flowcontrol;

public class ForStatement {

	// Usando while

	public double obtenerPromedio(double[] calificaciones) {

		int i = 0;
		double prom = 0.0;

		while (i < calificaciones.length) {
			prom += calificaciones[i];
			i++;
		}

		prom = prom / calificaciones.length;
		return prom;
	}

	// Otro usando dowhile public double obtenerPromedio2(double[]
	public double obtenerPromedio2(double[] calificaciones) {

		int i = 0;
		double prom2 = 0.0;

		do {
			prom2 += calificaciones[i];
			i++;

		} while (i < calificaciones.length);
		prom2 = prom2 / calificaciones.length;

		return prom2;
	}

	// Otro usando for
	public double obtenerPromedio3(double[] calificaciones) {

		int i = 0;
		double prom3 = 0.0;

		for (i = 0; i < calificaciones.length; i++) {
			prom3 += calificaciones[i];
		}

		prom3 = prom3 / calificaciones.length;

		return prom3;
	}

	public static void main(String[] args) {

		// Uso de for
		// for( acumulador; condicion; incremento )
		// Imprimir la numeracion de 1 ... 100

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}

		int[] calificacion = { 9, 8, 10, 8, 10 };
		for (int i = 0; i < calificacion.length; i++) {
			System.out.println("Las calificaciones son: " + calificacion[i]);
		}

		// Uso de for each
		for (int c : calificacion) {
			System.out.println("Las calificaciones son: " + c);
		}

		String[] familia = { "Juan", "Adrian", "Karina" };
		for (String s : familia) {
			System.out.println("Nombre: " + s);
		}

		for (int i = 0; i < familia.length; i++) {
			System.out.println("Nombre: " + familia[i]);
		}

		int[] edades = { 36, 35, 37, 32 };
		for (int e : edades) {
			System.out.println(e);
		}

		ForStatement promedio = new ForStatement();
		double[] cals = { 9.0, 8.1, 9.5, 7.8, 10.0 };
		double prom = promedio.obtenerPromedio(cals);
		System.out.println("Promedio: " + prom);
		double prom2 = promedio.obtenerPromedio2(cals);
		System.out.println("Promedio: " + prom2);
		double prom3 = promedio.obtenerPromedio3(cals);
		System.out.println("Promedio: " + prom3);
	}
}
