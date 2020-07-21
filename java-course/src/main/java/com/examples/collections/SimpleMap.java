package com.examples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleMap {

	public static void main(String[] args) {
		// Uso de Map
		// Requerimos los imports
		// java.util.HashMap
		// java.util.Map

		// Es valido, pero esta en desuso
//		Map months = new HashMap<>();

		// Es valido, pero a parti del JDK 7 ya es opcional
		// los tipos del lado derecho
//		Map<Integer, String> months = new HashMap<Integer,String>();

		Map<Integer, String> months = new HashMap<>();

		// Poner valores a un map
		months.put(1, "Enero");
		months.put(2, "Febrero");

		// Para obtener valores de un map
		// Si le pasas una llave que no existe retorna null
		// NOTA siempre debes verificar que el valor de retorno
		// no sea null
		String value = months.get(3);

		if (null != value) {
			System.out.println(value.toUpperCase());
		} else {
			System.out.println("llave no identificada");
		}

		months.put(2, "Feb");

		System.out.println(months);

		// Ver la longitud del Map
		System.out.println(months.size());

		// Para iterar sobre un Map
		// for (KeyType key : m.keySet())
		// System.out.println(key);
		for (Integer k : months.keySet()) {
			String s = months.get(k);
			System.out.println("Llave: " + k + " Valor: " + s);
		}

		for (Iterator<Integer> it = months.keySet().iterator(); it.hasNext();) {
			Integer k = it.next();
			String s = months.get(k);
			System.out.println("Llave: " + k + " Valor: " + s);
		}

		for (Map.Entry<Integer, String> e : months.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		// Otro ejemplo
		Map<String, List<Double>> califs = new HashMap<>();
		List<Double> cal1 = new ArrayList<>();
		cal1.add(7.5);
		califs.put("Juan", cal1);

		// TODO: Adrian completa con 10 elementos mas
		// y muestralos en pantalla con el metodo que elijas
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("A", "Primer letra del abecedario y vocales");
		diccionario.put("B", "Segunda letra del abecedario");
		diccionario.put("C", "Tercera letra del abecedario");
		diccionario.put("D", "Cuarta letra del abecedario");
		diccionario.put("E", "Quinta letra del abecedario");
		diccionario.put("F", "Sexta letra del abecedario");
		diccionario.put("G", "Septima letra del abecedario");
		diccionario.put("H", "Octava letra del abecedario");
		diccionario.put("I", "Novena letra del abecedario");
		diccionario.put("J", "Decima letra del abecedario");
		diccionario.put("K", "Undecima letra del abecedario");

		for (Map.Entry<String, String> d : diccionario.entrySet()) {
			System.out.println("Llave: " + d.getKey() + " Valor: " + d.getValue());
		}

		// TODO: Hacer el ejemplo de los meses pero con un map
		// Ejemplo: Enero -> 30
		Map<String, Integer> calendario = new HashMap<>();
		calendario.put("Enero", 31);
		calendario.put("Febrero", 29);
		calendario.put("Marzo", 31);
		calendario.put("Abril", 30);
		calendario.put("Mayo", 31);
		calendario.put("Junio", 30);
		calendario.put("Julio", 31);
		calendario.put("Agosto", 31);
		calendario.put("Septiembre", 30);
		calendario.put("Octubre", 31);
		calendario.put("Noviembre", 30);
		calendario.put("Diciembre", 31);

		for (Map.Entry<String, Integer> c : calendario.entrySet()) {
			System.out.println(c.getKey() + " tiene " + c.getValue() + " dias");
		}
		
		//Verificar si la coleccion esta vacia
		System.out.println( calendario.isEmpty() );
	}
}
