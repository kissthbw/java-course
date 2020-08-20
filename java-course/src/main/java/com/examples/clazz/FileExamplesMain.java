package com.examples.clazz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class FileExamplesMain {

	public static void readFile( String file ) throws IOException {
		
		BufferedReader inputStream = null;
		
		try {
			
			inputStream = new BufferedReader(new FileReader( file ));

			String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println( l );
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            
        }
	}
	
	public static void readFileTryWith( String file ) throws IOException {
		try( BufferedReader inputStream = new BufferedReader(new FileReader( file )) ){
			String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println( l );
            }
		}
	}
	
	public static void writeFile( String file ) throws IOException {
        PrintWriter outputStream = null;

        try {
        	//Puede usarse BufferedWriter(new FileWriter("characteroutput.txt"));
            outputStream = new PrintWriter(new FileWriter( file ));

            String l = "Mensaje";
            outputStream.println(l);
        } finally {

            if (outputStream != null) {
                outputStream.close();
            }
        }
	}
	
	public static void writeFileTryWith( String file ) throws IOException {
		try( BufferedWriter outputStream = new BufferedWriter(new FileWriter( file )) ){
			String l = "Mensaje";
			outputStream.write(l);
		}
	}
	
	public static void readXMLFile(String file) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

			String nombre = "nombre";
			boolean isNombre = false;

			public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {

				System.out.println("Star Tag:" + qName);

				if (qName.equalsIgnoreCase(nombre)) {
					isNombre = !isNombre;
				}

			}

			public void endElement(String uri, String localName, String qName) throws SAXException {
				System.out.println("End Tag :" + qName);
			}

			public void characters(char ch[], int start, int length) throws SAXException {

				if (isNombre) {
					System.out.println("Nombre: " + new String(ch, start, length));
					isNombre = !isNombre;
				}

			}

		};

			
		saxParser.parse(file, handler);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void readJSONFile(String file){
		try {
			ObjectMapper mapper = new ObjectMapper();
			CollectionType javaType = mapper.getTypeFactory()
				      .constructCollectionType(List.class, Client.class);
			List<Client> map = mapper.readValue(new File(file), javaType);
			System.out.println( map );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main( String[] args ) throws IOException {
		FileExamplesMain.readFile( "/Users/juanosorioalvarez/Desktop/text.txt" );
		FileExamplesMain.writeFile( "/Users/juanosorioalvarez/Desktop/text-write.txt" );
		FileExamplesMain.readFileTryWith( "/Users/juanosorioalvarez/Desktop/text.txt" );
		FileExamplesMain.writeFileTryWith( "/Users/juanosorioalvarez/Desktop/text-writeTryWith.txt" );
		FileExamplesMain.readXMLFile("/Users/juanosorioalvarez/Desktop/cleintes.xml");
		FileExamplesMain.readJSONFile("/Users/juanosorioalvarez/Desktop/clientes.json");
	}
	
}
