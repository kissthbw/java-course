package com.examples.string;

public class StringExamples {
	
	public static void main( String[] args ) {
		//El uso de la String
		String s1 = "Hola Mundo";
		String s2 = new String("Con el constructor");
		
		//Concatenacion
		String mensaje = "Hola " + " Juan";
		mensaje = mensaje + s2;
		
		//Subbcadenas
//		s1 = s1.substring(0, 4);
		System.out.println( s1.substring(0, 4) );
		
		//Comparacion de cadenas
		s1 = "Hola";
		s2 = "Hola ";
		
//		s2 = s2.substring(0, 4);
		//trim: este metodo quita espacios en blanco
		
		s2 = s2.trim();
		
		System.out.println( s1.equals(s2) );
		
		//Metodos para mayususculas y minusculas
		s2 = "juan";
		s2 = s2.toUpperCase();
		System.out.println( s2 );
		
		s2 = "JUAN";
		s2 = s2.toLowerCase();
		System.out.println( s2 );
		
		s1 = "JUAN";
		s2 = "juan";
		System.out.println( s1.equals(s2) );
		
		System.out.println( s1.equalsIgnoreCase(s2) );
		
		//Ejercicios
		
		String frase1 = "parangaricutirimicuaro";
		String frase2 = "TRABALENGUAS";
		String frases = "  Hola a todos " + "yo soy ";
		frases = frases + frase1 + " y soy un " + frase2.toLowerCase();
		
		System.out.println("Ejercicios");
		System.out.println(frases);
		System.out.println(frases.length());
		System.out.println(frase1.equalsIgnoreCase(frase2));
		System.out.println(frases.toUpperCase());
		System.out.println(frase2.substring(5, 12));
		System.out.println(frases.trim());
	}
}
