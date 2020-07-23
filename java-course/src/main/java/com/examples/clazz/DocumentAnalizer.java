//1. El paquete al que corresponde la clase (Opcional, pero la buena practica es que 
//   se agregue un paquete) 
package com.examples.clazz;

//2. Los imports (Opcional*)
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//3. La definicion de la clase
//nivel_de_acceso class nombre_de_la_clase
public class DocumentAnalizer {

	//4. Propiedades o campos
	private Integer totalLetras;
	private Integer totalParrafos;
	int totalPalabras;
	int totalLineas;
	int totalSignosPuntuacion;
	
	//5. Constructores
	public DocumentAnalizer() {
		this.totalLetras = 0;
		this.totalParrafos = 0;
	}
	
	
	public Integer getTotalLetras() {
		return this.totalLetras;
	}
	
	public Integer getTotalParrafos() {
		return this.totalParrafos;
	}
	
	//6. Metodos
	// nivel_de_acceso tipo_retorno nombre_del_metodo ( lista_parametros )
	public void analize( File sourceFile ) {
		
		if( sourceFile.exists() ) {
			Path path = Paths.get( sourceFile.toString() );
			
			try (BufferedReader reader = Files.newBufferedReader(path)) {
			    String line = null;
			    while ( (line = reader.readLine()) != null ) {
			    	int l = line.length();
			        totalLetras = totalLetras + l;
			        int pos = line.lastIndexOf(".");
			        if( pos == ( l - 1 ) ) {
			        	totalParrafos++;
			        }
			    	
			    	System.out.println(line);
			    }
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
			}
		}
		else {
			System.out.println( "El archivo: " + sourceFile + " no existe" );
		}
	}
}
