//1. El paquete al que corresponde la clase (Opcional, pero la buena practica es que 
//   se agregue un paquete) 
package com.examples.clazz;

//2. Los imports (Opcional*)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	private Integer totalPuntos;
	private Integer totalComas;
	private Integer totalInterrogacion;
	private Integer totalExclamacion;
	private Map<String, Integer> estadisticas = new HashMap<>();
	
	private static final String coma = "[,]";
	private static final String punto = "[.]";
	private static final String abreInterrogacion = "¿";
	private static final String cierraInterrogacion = "\\?";
	private static final String abreExclamacion = "¡";
	private static final String cierraExclamacion = "!";
	
	//5. Constructores
	public DocumentAnalizer( File sourceFile ) {
		this.sourceFile = sourceFile;
		this.init();
	}
	
	public DocumentAnalizer() {
		this.init();
	}
	
	private void init() {
		this.totalLetras = 0;
		this.totalParrafos = 0;
		this.totalPalabras = 0;
		this.totalLineas = 0;
		this.totalSignosPuntuacion = 0;
		this.totalPuntos = 0;
		this.totalComas= 0;
		this.totalInterrogacion = 0;
		this.totalExclamacion = 0;
	}
	
	public void setFileSource( File sourceFile ) {
		this.sourceFile = sourceFile;
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
	
	public Integer getTotalPuntos() {
		return this.totalPuntos;
	}
	
	public Integer getTotalComas() {
		return this.totalComas;
	}
	
	public Integer getTotalInterrogacion() {
		return this.totalInterrogacion;
	}
	
	public Integer getTotalExclamacion() {
		return this.totalExclamacion;
	}

	public Map<String, Integer> getEstadisticas(){
		return this.estadisticas;
	}

	//6. Metodos
	// nivel_de_acceso tipo_retorno nombre_del_metodo ( lista_parametros )
	public void analize( File sourceFile ) {
		this.sourceFile = sourceFile;
		this.analize();
	}
	
	public void analize() {
		
		if( null == sourceFile ) {
			System.out.println( "No se ha proporcionado un archivo" );
			return;
		}
		
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
			        
			        //Definimos el patron
			        //Las cadenas o caracteres a buscar deben ir entre corchetes []
			        Pattern pattern = Pattern.compile("[,.¿\\?¡!]");
			        Pattern p = Pattern.compile( "[" +  punto + "]" );
			        Pattern c = Pattern.compile("[" +  coma + "]");
			        Pattern aI = Pattern.compile("[" +  abreInterrogacion + "]");
			        Pattern cI = Pattern.compile("[" +  cierraInterrogacion + "]");
			        Pattern aE = Pattern.compile("[" +  abreExclamacion + "]");
			        Pattern cE = Pattern.compile("[" +  cierraExclamacion + "]");
			        
			        //Se define el texto donde se va a buscar
			        Matcher matcher = pattern.matcher( line );
			        Matcher m = p.matcher(line);
			        Matcher m1 = c.matcher(line);
			        Matcher m2 = aI.matcher(line);
			        Matcher m3 = cI.matcher(line);
			        Matcher m4 = aE.matcher(line);
			        Matcher m5 = cE.matcher(line);
			        
			        while (matcher.find()) {
			        	totalSignosPuntuacion++;
			        }
			        
			        while (m.find()) {
			        	totalPuntos++;
			        }
			        
			        while (m1.find()) {
			        	totalComas++;
			        }
			        
			        while (m2.find()) {
			        	totalInterrogacion++;
			        }
			        
			        while (m3.find()) {
			        	totalInterrogacion++;
			        }
			        
			        while (m4.find()) {
			        	totalExclamacion++;
			        }
			        
			        while (m5.find()) {
			        	totalExclamacion++;
			        }
			        
			        /*
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
			        */
			        
			        totalPalabras = totalPalabras + palabras.length;
			        
			        //buscar la posicion de signos de puntuacion y contar totalSignosPuntuacion
			        int pos = line.lastIndexOf(".");
			        if( pos == ( l - 1 ) ) {
			        	totalParrafos++;
			        }
			    	
			    	System.out.println(line);
			    }
			    
			    estadisticas.put("PUNTOS", totalPuntos);
			    estadisticas.put("COMAS", totalComas);
			    estadisticas.put("INTERROGACION", totalInterrogacion);
			    estadisticas.put("EXCLAMACION", totalExclamacion);
			    
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
			}
		}
		else {
			System.out.println( "El archivo: " + this.sourceFile + " no existe" );
		}
	}
	
	public void statsReport( File targetFile ) {
		Charset charset = Charset.forName("US-ASCII");

		Path path = Paths.get( targetFile.toString() );
		
		try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
			writer.write( "Total de letras: " + this.totalLetras + "\n" );
			writer.write( "Total de palabras: " + this.totalPalabras + "\n" );
			writer.write( "Total de signos de interrogacion: " + this.totalInterrogacion + "\n" );
			writer.write( "Total de signos de exclamacion: " + this.totalExclamacion + "\n" );
//		    writer.write(s, 0, s.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
}
