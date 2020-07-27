package com.examples.clazz;

import java.io.File;

public class DocumentAnalizerMain {
	public static void main( String[] args ) {
		DocumentAnalizer doc = new DocumentAnalizer();
		File file = new File( "/Users/Adrian/Desktop/conexionBDShingShing.txt" );
		doc.analize(file);
		System.out.println( "Total de letras: " + doc.getTotalLetras() );
		System.out.println( "Total de parrafos: " + doc.getTotalParrafos() );
		System.out.println( "Total de lineas: " + doc.getTotalLineas());
		System.out.println( "Total de palabras: " + doc.getTotalPalabras());

	}
}
