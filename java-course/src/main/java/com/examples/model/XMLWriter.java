package com.examples.model;

import java.util.List;

public class XMLWriter implements Writer {

	@Override
	public void write(List<String> lines) {
		System.out.println( "Escribiendo archivo XML" );
	}

}
