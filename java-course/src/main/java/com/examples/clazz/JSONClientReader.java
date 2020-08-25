package com.examples.clazz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class JSONClientReader implements ClientReader {

	private File sourceFile;
	private List<Client> listClient = new ArrayList<>();

	public File getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(File sourceFile) {
		this.sourceFile = sourceFile;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	// Constructor
	public JSONClientReader(File sourceFile) {
		this.sourceFile = sourceFile;

	}

	@Override
	public void reader() {

		// Complementa este metodo para que lea un archivo de csv
		// Nota: puedes usar la funcionalidad de DocumentAnalizer para leer
		// Debes crear una clase Cliente con los campos de acuerdo a lo definido
		// en los archivos
		// Lees el archivo
		// Guardar la informacion del texto en una List de Cliente e imprimirla

		if (null == sourceFile) {
			System.out.println("No se ha proporcionado un archivo");
			return;
		}

		if (this.sourceFile.exists()) {
			Path path = Paths.get(this.sourceFile.toString());

			try {
				ObjectMapper mapper = new ObjectMapper();
				CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, Client.class);
				listClient = mapper.readValue(sourceFile, javaType);
				
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		} else {

			System.out.println("El archivo: " + this.sourceFile + " no existe");
		}
	}

	// Agregar un main
	public static void main(String[] args) {
		File file = new File("C:/Users/Adrian/Documents/java-course/java-course/src/main/resources/clientes.json");

		JSONClientReader cliente = new JSONClientReader(file);
		cliente.reader();
		cliente.print();
	}

	@Override
	public void print() {

		for (int i = 0; i < listClient.size(); i++) {
			System.out.println("Cliente: " + listClient.get(i).getNombre());
		}
	}

}
