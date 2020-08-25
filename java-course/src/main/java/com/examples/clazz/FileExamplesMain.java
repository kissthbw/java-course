package com.examples.clazz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class FileExamplesMain {

	public static void readFile(String file) throws IOException {

		BufferedReader inputStream = null;

		try {

			inputStream = new BufferedReader(new FileReader(file));

			String l;
			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}

		}
	}

	public static void readFileTryWith(String file) throws IOException {
		try (BufferedReader inputStream = new BufferedReader(new FileReader(file))) {
			String l;
			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);
			}
		}
	}

	public static void writeFile(String file) throws IOException {
		PrintWriter outputStream = null;

		try {
			// Puede usarse BufferedWriter(new FileWriter("characteroutput.txt"));
			outputStream = new PrintWriter(new FileWriter(file));

			String l = "Mensaje";
			outputStream.println(l);
		} finally {

			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

	public static void writeFileTryWith(String file) throws IOException {
		try (BufferedWriter outputStream = new BufferedWriter(new FileWriter(file))) {
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
				String paterno = "paterno";
				String materno = "materno";
				String edad = "edad";
				String cuenta = "cuenta";
				String email = "email";
				String area = "area";
				boolean isNombre = false;
				boolean isPaterno = false;
				boolean isMaterno = false;
				boolean isEdad = false;
				boolean isCuenta = false;
				boolean isEmail = false;
				boolean isArea = false;

				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {

					System.out.println("Star Tag:" + qName);

					if (qName.equalsIgnoreCase(nombre)) {
						isNombre = !isNombre;
					}

					if (qName.equalsIgnoreCase(paterno)) {
						isPaterno = !isPaterno;
					}

					if (qName.equalsIgnoreCase(materno)) {
						isMaterno = !isMaterno;
					}

					if (qName.equalsIgnoreCase(edad)) {
						isEdad = !isEdad;
					}

					if (qName.equalsIgnoreCase(cuenta)) {
						isCuenta = !isCuenta;
					}

					if (qName.equalsIgnoreCase(email)) {
						isEmail = !isEmail;
					}

					if (qName.equalsIgnoreCase(area)) {
						isArea = !isArea;
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

					if (isPaterno) {
						System.out.println("Paterno: " + new String(ch, start, length));
						isPaterno = !isPaterno;
					}

					if (isMaterno) {
						System.out.println("Materno: " + new String(ch, start, length));
						isMaterno = !isMaterno;
					}

					if (isEdad) {
						System.out.println("Edad: " + new String(ch, start, length));
						isEdad = !isEdad;
					}

					if (isCuenta) {
						System.out.println("Cuenta: " + new String(ch, start, length));
						isCuenta = !isCuenta;
					}

					if (isEmail) {
						System.out.println("Email: " + new String(ch, start, length));
						isEmail = !isEmail;
					}

					if (isArea) {
						System.out.println("Area: " + new String(ch, start, length));
						isArea = !isArea;
					}
				}
			};

			saxParser.parse(file, handler);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readJSONFile(String file) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, Client.class);
			List<Client> map = mapper.readValue(new File(file), javaType);
			System.out.println(map);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		FileExamplesMain.readFile("/Users/Adrian/Desktop/text.txt");
		FileExamplesMain.writeFile("/Users/Adrian/Desktop/text-write.txt");
		FileExamplesMain.readFileTryWith("/Users/Adrian/Desktop/text.txt");
		FileExamplesMain.writeFileTryWith("/Users/Adrian/Desktop/text-writeTryWith.txt");
		FileExamplesMain
				.readXMLFile("C:/Users/Adrian/Documents/java-course/java-course/src/main/resources/cleintes.xml");
		FileExamplesMain
				.readJSONFile("C:/Users/Adrian/Documents/java-course/java-course/src/main/resources/clientes.json");
	}

}
