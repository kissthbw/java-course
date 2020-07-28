package com.examples.clazz;

import java.io.File;
import java.util.Map;

public class DocumentAnalizerMain {
	public static void main( String[] args ) {
		File file = new File( "/Users/juanosorioalvarez/Desktop/text.txt" );
		DocumentAnalizer doc = new DocumentAnalizer(file);
		
		doc.analize();
		System.out.println( "Total de letras: " + doc.getTotalLetras() );
		System.out.println( "Total de parrafos: " + doc.getTotalParrafos() );
		System.out.println( "Total de lineas: " + doc.getTotalLineas());
		System.out.println( "Total de palabras: " + doc.getTotalPalabras());
		System.out.println( "Total de signos: " + doc.getTotalSignosPuntuacion());
		System.out.println( "Total de puntos: " + doc.getTotalPuntos());
		
		Map<String, Integer> estadisticas = doc.getEstadisticas();
		
		System.out.println( "Total de puntos: " + estadisticas.get("PUNTOS"));

	}
}
