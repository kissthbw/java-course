package com.examples.flowcontrol;

public class DoWhileStatements {

	// Este metodo va encontrar el numero pasado parametro dentro de un arreglo de
	// enteros
	public void encuentraNumero(int[] array, int numero) {
		int i = 0;
		while( i < array.length ) {
			System.out.println( array[ i ] );
			
			if( numero == array[ i ] ) {
				System.out.println( "El numero: " + numero + 
						" esta en la posicion: " + i );
				
				break; //Sirve para salirte del bicle de ejecucion
			}
			
			i++;
		}
	}
	
	//TODO: Adrian haz otro metodo encuentraNumero2, pero en lugar de usar while, usa do while
	//TODO: Adrian haz otro metodo encuentraOcuurencias, que reciba un array y un numero a buscar
	//imprimir las n veces que se encuentre numero en el array

	public static void main(String[] args) {
		// while(){}
		// Evalua una expresion boolean y ejecuta el codigo ubicado entre {}
		// hasta que la expresion sea false

		System.out.println("While...");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			// i++;//post increment
			i = i + 1;
		}

		System.out.println("Do While...");
		i = 11;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);

		DoWhileStatements ejemplo = new DoWhileStatements();
		int[] array = { 35, 36, 14, 37 };
		int numero = 14;
		
		//Los arreglos iniciian en la posicion 0 
		ejemplo.encuentraNumero(array, numero);
	}
}
