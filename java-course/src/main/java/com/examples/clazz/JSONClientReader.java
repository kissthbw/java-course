package com.examples.clazz;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSONClientReader implements ClientReader {

	private File sourceFile;

	public File getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(File sourceFile) {
		this.sourceFile = sourceFile;
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

			try (BufferedReader reader = Files.newBufferedReader(path)) {
				String line = null;
				while ((line = reader.readLine()) != null) {
					String[] datos = line.split(",");
				}

				System.out.println(line);
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
	}
}
