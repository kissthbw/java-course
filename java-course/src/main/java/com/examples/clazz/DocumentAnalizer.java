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
	private File sourceFile;
	private Integer totalLetras;
	private Integer totalParrafos;
	private Integer totalPalabras;
	private Integer totalLineas;
	private Integer totalSignosPuntuacion;
	private static final String coma = ",";
	private static final String punto = ".";
	private static final String abreInterrogacion = "¿";
	private static final String cierraInterrogacion = "\\?";
	private static final String abreExclamacion = "¡";
	private static final String cierraExclamacion = "!";
	
	//5. Constructores
	public DocumentAnalizer( File sourceFile ) {
		this.sourceFile = sourceFile;
		this.totalLetras = 0;
		this.totalParrafos = 0;
		this.totalPalabras = 0;
		this.totalLineas = 0;
		this.totalSignosPuntuacion = 0;
	}
	
	public Integer getTotalLetras() {
		return this.totalLetras;
	}
	
	public Integer getTotalParrafos() {
		return this.totalParrafos;
	}
	
	public Integer getTotalPalabras() {
		return this.totalPalabras;
	}
	
	public Integer getTotalLineas() {
		return this.totalLineas;
	}
	
	public Integer getTotalSignosPuntuacion() {
		return this.totalSignosPuntuacion;
	}
	
	//6. Metodos
	// nivel_de_acceso tipo_retorno nombre_del_metodo ( lista_parametros )
	public void analize() {
		
		if( this.sourceFile.exists() ) {
			Path path = Paths.get( this.sourceFile.toString() );
			
			try (BufferedReader reader = Files.newBufferedReader(path)) {
			    String line = null;
			    while ( (line = reader.readLine()) != null ) {
			    	int l = line.length();
			        totalLetras = totalLetras + l;
			        totalLineas++;
			        //buscar espacios en blanco para contar totalPalabras
			        String[] palabras = line.split(" ");
			        String[] signos = line.split( coma );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        signos = line.split( punto );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        signos = line.split( abreInterrogacion );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        signos = line.split( cierraInterrogacion );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        signos = line.split( abreExclamacion );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        signos = line.split( cierraExclamacion );
			        totalSignosPuntuacion = totalSignosPuntuacion + signos.length;
			        
			        totalPalabras = totalPalabras + palabras.length;
			        
			        //buscar la posicion de signos de puntuacion y contar totalSignosPuntuacion
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
			System.out.println( "El archivo: " + this.sourceFile + " no existe" );
		}
	}
}
