package com.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SimpleSet {

	public static void main(String[] args) {
		// creacion de sets
		// Un set no permite valores duplicados

		// Se deben importar:
		// java.util.HashSet
		// java.util.Set
		Set<Integer> numbers = new HashSet<>();

		// Agregar un elemento
		numbers.add(1);
		numbers.add(2);
		numbers.add(1);
		System.out.println(numbers);

		// Tamanio del set
		System.out.println("Size: " + numbers.size());

		// Verificar si existe un elemento
		System.out.println("Existe el elemento 3?: " + numbers.contains(3));

		// Eliminar un elemento
		numbers.remove(1);
		System.out.println(numbers);

		// Iterar elementos
		System.out.println("Iterar con for each");
		for (Integer i : numbers) {
			System.out.println(i);
		}

		// Con iterator
		// Importar:
		// java.util.Iterator
		System.out.println("Iterar con Iterator");
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}

		// Convertir a List
		List<Integer> list = new ArrayList<>();
		list.addAll(numbers);
		System.out.println(list);

		// Convertir de List a Set
		List<String> strings = Arrays.asList("1", "2", "3", "1");
		Set<String> sets = new HashSet<>();
		sets.addAll(strings);
		System.out.println(sets);

		// TODO: Adrian:
		// Crear un Set de Strings que contenga los dias de la semana
		// Iterar sobre el
		// Despues convertir ese Set a List
		Set<String> diasSemana = new HashSet<>();
		diasSemana.add("Lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miercoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");
		diasSemana.add("Sábado");
		diasSemana.add("Domingo");

		System.out.println("Días de la semana usando Set");

		for (String s : diasSemana) {
			System.out.println(s);
		}

		List<String> s = new ArrayList<>();
		s.addAll(diasSemana);

		System.out.println("Días de la semana con conversion a List");

		for (String dias : s) {
			System.out.println(dias);
		}
	}
}
