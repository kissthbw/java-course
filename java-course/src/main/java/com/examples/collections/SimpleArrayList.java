package com.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {
	public static void main(String[] args) {
		// ArrayListes una coleccion de objetos ordenados mutable
		// se pueden repetir sus valores
		// S requiere hacer el import de la respectiva clase

		// Viejo estilo, ya no usar
		ArrayList lista = new ArrayList();
		lista.add("Enero");
		lista.add("Febrero");
		lista.add(45);

		// Nota: antes de Java 7
		// Tenias que poner ArrayList<String> meses = new ArrayList<String>();
		ArrayList<String> meses = new ArrayList<>();

		// Usar esta forma
		// El tipo debe ser la interface List (java.util.List)
		List<String> months = new ArrayList<>();
		months.add("Enero"); // ->0
		months.add("Febrero"); // ->1

		// Para obtener la longitud de la lista
		System.out.println("size: " + months.size());

		// Accedes a sus valores a traves del indice que va de 0 a longitud - 1
		System.out.println("Valor del elemento 1:" + months.get(1));
		months.add("Marzo"); // ->2

		System.out.println("size: " + months.size());
		months.remove(0);

		System.out.println("size: " + months.size());

		// Para iterar puedes usar un blucle
		// o el for each
		for (String m : months) {
			System.out.println("Valor: " + m);
		}

		// Para insertar un valor en cierta posicion
		months.add(0, "Enero");

		// Para cambiar el valor de un objeto en cierta posicion
		months.set(0, "ENERO");

		for (int i = 0; i < months.size(); i++) {
			System.out.println("Valor: " + i + "-" + months.get(i));
		}

		System.out.println(months.toString());

		// TODO: Adrian imprime un calendario usando ArrayList
		List<String> calendario = new ArrayList<>();
		calendario.add("enero 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("febrero 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29");
		calendario.add("marzo 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("abril 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		calendario.add("mayo 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("junio 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		calendario.add("julio 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("agosto 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("septiembre 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		calendario.add("octubre 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		calendario.add("noviembre 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		calendario.add("diciembre 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31");
		
		for(int i = 0; i < calendario.size(); i++) {
			
			System.out.println(calendario.get(i));
		}
	}
}
