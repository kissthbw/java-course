package com.examples.clazz;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVClientReader implements ClientReader {

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

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	// Constructor
	public CSVClientReader(File sourceFile) {
		this.sourceFile = sourceFile;
		this.reader();
	}

	@Override
	public void reader() {
		listClient = new ArrayList<>();
		if (null == sourceFile) {
			System.out.println("No se ha proporcionado un archivo");
			return;
		}

		if (this.sourceFile.exists()) {
			Path path = Paths.get(this.sourceFile.toString());

			try (BufferedReader reader = Files.newBufferedReader(path)) {
				String line = null;
				int pos = 0;
				while ((line = reader.readLine()) != null) {
					// System.out.println(line);

					if (pos == 0) {
						pos++;
					} else {
						String[] datos = line.split(",");

						Client cliente = new Client();

						cliente.setNombre(datos[0]);
						cliente.setPaterno(datos[1]);
						cliente.setMaterno(datos[2]);
						cliente.setEdad(datos[3]);
						cliente.setCuenta(datos[4]);
						cliente.setEmail(datos[5]);
						cliente.setArea(datos[6]);
						/*
						 * System.out.println("cliente: " + cliente.getNombre() + " " +
						 * cliente.getPaterno() + " " + cliente.getMaterno() + " " + cliente.getEdad() +
						 * " " + cliente.getCuenta() + " " + cliente.getEmail() + " " +
						 * cliente.getArea());
						 */

						this.listClient.add(cliente);
					}
				}
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		} else {

			System.out.println("El archivo: " + this.sourceFile + " no existe");
		}
	}

	@Override
	public void print() {
		
		for (int i = 0; i < listClient.size(); i++) {

			System.out.println("Cliente: " + listClient.get(i).getNombre());
		}
	}

	public static void main(String[] args) {

		File file = new File("/Users/juanosorioalvarez/Desktop/clientes.csv");

		CSVClientReader doc = new CSVClientReader(file);
		doc.reader();
		System.out.println("Archivo: " + doc.getSourceFile());
		doc.print();
		System.out.println("Cliente: " + doc.getListClient().toString());
	}
}
