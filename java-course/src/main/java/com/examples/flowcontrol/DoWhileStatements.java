package com.examples.flowcontrol;

public class DoWhileStatements {

	//Este metodo va encontrar el numero pasado parametro dentro de unarreglo de enteros
	public void encuentraNumero( int[] array, int numero ) {
		
	}
	
	public static void main( String[] args ) {
		//while(){}
		//Evalua una expresion boolean y ejecuta el codigo ubicado entre {}
		//hasta que la expresion sea false
		
		System.out.println( "While..." );
		int i = 0;
		while( i <= 10 ) {
			System.out.println( i );
//			i++;//post increment
			i = i + 1;
		}
		
		System.out.println( "Do While..." );
		i = 11;
		do {
			System.out.println( i );
			i++;
		}while( i <= 10 );
		
		DoWhileStatements ejemplo = new DoWhileStatements();
		int[] array = { 35, 36, 14, 37 };
		int numero = 14;
		ejemplo.encuentraNumero( array, numero );
		
		
	}
	
	
	
}
