package com.examples.collections;

public class SimpleArray {

	public static void main(String[] args) {
		// 1 Declarion e inicializacion de un array
		String[] n1 = { "Juan", "Adrian", "Karina" };
		String n12[] = { "Juan", "Adrian", "Karina" };

		String[] n2 = new String[3];
		n2[0] = "Juan";
		n2[1] = "Adrian";
		n2[2] = "Karina";

		// Saber su tamanio
		System.out.println(n2.length);

		// Se accede a traves de su indice
		// Su maximo indidce es length - 1
		System.out.println(n2[0]);
		System.out.println(n2[2]);

		// Iterar sobre un arreglo
		// Es a traves de un blucle
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}

		// Iterar con for each
		int i = 0;
		for (String s : n2) {
			System.out.println(s);
		}

		//
		int[] numeros = { 1, 2, 3 };

		// Arreglos de 2 dimensiones
		// inicializacion
		int[][] matriz = { { 1, 2, 3 }, // 0
				{ 2, 4, 6 }, // 1
				{ 1 }// 2
		};

		// Explicacion:
		// En el ejemplo de arriba tenemos un arreglo de 2 x 3
		// [0] -> [0] = 1
		// [0] -> [1] = 2
		// [0] -> [2] = 3

		// [1] -> [0] = 2
		// [1] -> [1] = 4
		// [1] -> [2] = 6

		System.out.println("Valor del arreglo bidimensional en (0,0): " + matriz[0][0]);
		System.out.println("Tamano del arreglo bidimensional: " + matriz.length);

		for (int row = 0; row < matriz.length; row++) { // Es para iterar sobre "x"
			for (int column = 0; column < matriz[row].length; column++) { // Es para iterar sobre "y"
				System.out.print(matriz[row][column] + " ");
			}
			System.out.println("");
		}

		// TODO Adrian crear un arreglo bidimensional que represente los meses y los
		// dias de cada mes
		// Ejemplo
		// mes[0] = 1,2,3....30

		String[][] calendario = {
				{ "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre",
						"noviembre", "diciembre" },
				{ "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1" },
				{ "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2" },
				{ "3", "3", "3", "3", "3", "3", "3", "3", "3", "3", "3", "3" },
				{ "4", "4", "4", "4", "4", "4", "4", "4", "4", "4", "4", "4" },
				{ "5", "5", "5", "5", "5", "5", "5", "5", "5", "5", "5", "5" },
				{ "6", "6", "6", "6", "6", "6", "6", "6", "6", "6", "6", "6" },
				{ "7", "7", "7", "7", "7", "7", "7", "7", "7", "7", "7", "7" },
				{ "8", "8", "8", "8", "8", "8", "8", "8", "8", "8", "8", "8" },
				{ "9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9" },
				{ "10", "10", "10", "10", "10", "10", "10", "10", "10", "10", "10", "10" },
				{ "11", "11", "11", "11", "11", "11", "11", "11", "11", "11", "11", "11" },
				{ "12", "12", "12", "12", "12", "12", "12", "12", "12", "12", "12", "12" },
				{ "13", "13", "13", "13", "13", "13", "13", "13", "13", "13", "13", "13" },
				{ "14", "14", "14", "14", "14", "14", "14", "14", "14", "14", "14", "14" },
				{ "15", "15", "15", "15", "15", "15", "15", "15", "15", "15", "15", "15" },
				{ "16", "16", "16", "16", "16", "16", "16", "16", "16", "16", "16", "16" },
				{ "17", "17", "17", "17", "17", "17", "17", "17", "17", "17", "17", "17" },
				{ "18", "18", "18", "18", "18", "18", "18", "18", "18", "18", "18", "18" },
				{ "19", "19", "19", "19", "19", "19", "19", "19", "19", "19", "19", "19" },
				{ "20", "20", "20", "20", "20", "20", "20", "20", "20", "20", "20", "20" },
				{ "21", "21", "21", "21", "21", "21", "21", "21", "21", "21", "21", "21" },
				{ "22", "22", "22", "22", "22", "22", "22", "22", "22", "22", "22", "22" },
				{ "23", "23", "23", "23", "23", "23", "23", "23", "23", "23", "23", "23" },
				{ "24", "24", "24", "24", "24", "24", "24", "24", "24", "24", "24", "24" },
				{ "25", "25", "25", "25", "25", "25", "25", "25", "25", "25", "25", "25" },
				{ "26", "26", "26", "26", "26", "26", "26", "26", "26", "26", "26", "26" },
				{ "27", "27", "27", "27", "27", "27", "27", "27", "27", "27", "27", "27" },
				{ "28", "28", "28", "28", "28", "28", "28", "28", "28", "28", "28", "28" },
				{ "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29" },
				{ "30", "", "30", "30", "30", "30", "30", "30", "30", "30", "30", "30" },
				{ "31", "", "31", "", "31", "", "31", "31", "", "31", "", "31" }
		};

		/*
		 * String[][] calendario = { {"Enero", "1", "..." , "30"}, {"Febrero", "1",
		 * "..." , "30"} };
		 */

		for (int mes = 0; mes < calendario.length; mes++) {
			for (int dia = 0; dia < calendario[mes].length; dia++) {
				System.out.printf("%s\t", calendario[mes][dia]);
			}

			System.out.println("");
		}

		System.out.println(calendario.toString());

	}
}
