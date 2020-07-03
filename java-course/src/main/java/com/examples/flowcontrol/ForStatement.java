package com.examples.flowcontrol;

public class ForStatement {

	//Usando while
	public double obtenerPromedio( double[] calificaciones ) {
		return 0.0;
	}
	
	//Otro usando dowhile
	
	//Otro usando for
	
	public static void main(String[] args) {
		
		//Uso de for
		//for( acumulador; condicion; incremento )
		//Imprimir la numeracion de 1 ... 100
		
		for( int i = 1; i <= 100; i++ ) {
			System.out.println( i );
		}
		
		for( int i = 100; i >= 0; i-- ) {
			System.out.println( i );
		}
		
		int[] calificacion = {9, 8, 10, 8, 10};
		for( int i = 0; i < calificacion.length; i++ ) {
			System.out.println( "Las calificaciones son: " + calificacion[i] );
		}
		
		//Uso de for each
		for( int c : calificacion ) {
			System.out.println( "Las calificaciones son: " + c );
		}
		
		String[] familia = { "Juan", "Adrian", "Karina" };
		for( String s : familia ) {
			System.out.println( "Nombre: " + s );
		}
		
		for( int i = 0; i < familia.length; i++ ) {
			System.out.println( "Nombre: " + familia[i] );
		}
		
		int[] edades = { 36, 35, 37, 32 };
		for( int e:edades ) {
			System.out.println( e );
		}
		
		ForStatement promedio = new ForStatement();
		double[] cals = {9.0};
		promedio.obtenerPromedio(cals);
	}
}
