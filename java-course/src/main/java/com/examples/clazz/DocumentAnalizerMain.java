package com.examples.clazz;

import java.io.File;
import java.util.Map;

public class DocumentAnalizerMain {
	public static void main( String[] args ) {
		File file = new File( "/Users/juanosorioalvarez/Desktop/text.txt" );
		File targetFile = new File( "/Users/juanosorioalvarez/Desktop/text-report.txt" );
		
		DocumentAnalizer doc = new DocumentAnalizer(file);
		
		doc.analize();
		System.out.println( "Total de letras: " + doc.getTotalLetras() );
		System.out.println( "Total de parrafos: " + doc.getTotalParrafos() );
		System.out.println( "Total de lineas: " + doc.getTotalLineas());
		System.out.println( "Total de palabras: " + doc.getTotalPalabras());
		System.out.println( "Total de signos: " + doc.getTotalSignosPuntuacion());
		System.out.println( "Total de puntos: " + doc.getTotalPuntos());
		System.out.println( "Total de comas: " + doc.getTotalComas());
		System.out.println( "Total de signos de interrogacion: " + doc.getTotalInterrogacion());
		System.out.println( "Total de signos de exclamacion: " + doc.getTotalExclamacion());
		
		Map<String, Integer> estadisticas = doc.getEstadisticas();
		
		System.out.println( "Total de puntos: " + estadisticas.get("PUNTOS"));
		System.out.println( "Total de comas: " + estadisticas.get("COMAS"));
		System.out.println( "Total de signos de interrogacion: " + estadisticas.get("INTERROGACION"));
		System.out.println( "Total de signos de exclamacion: " + estadisticas.get("EXCLAMACION"));

		DocumentAnalizer doc2 = new DocumentAnalizer();
		doc2.analize( file );
		
		DocumentAnalizer doc3 = new DocumentAnalizer();
		doc3.setFileSource(file);
		doc3.analize();
		doc3.statsReport( targetFile );
	}
}
