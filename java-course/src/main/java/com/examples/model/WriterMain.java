package com.examples.model;

public class WriterMain {

	public static void main( String[] args ) {
		JSONWriter json = new JSONWriter();
		json.write( null );
		
		XMLWriter xml = new XMLWriter();
		xml.write(null);
		
		//Con interface
		Writer json2 = new JSONWriter();
		Writer xml2 = new XMLWriter();
		json2.write(null);
		xml2.write(null);
	}
}
