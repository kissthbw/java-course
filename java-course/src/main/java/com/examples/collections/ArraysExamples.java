package com.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExamples {

	public static void main( String[] args ) {
		//ArrayList to array
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println( objectArray.length );
		System.out.println( Arrays.toString(objectArray) );
		
		//Para especificar el tipo del arreglo
		String[] stringArray = list.toArray( new String[0] );
		System.out.println( objectArray.length );
		System.out.println( Arrays.toString(stringArray) );
		
		//Array to ArrayList
		System.out.println( "Array to ArrayList" );
		String[] array = { "hawk", "robin" };
		List<String> stringList = new ArrayList<String>( Arrays.asList( array ) ); //fixedSize
		System.out.println( stringList.size() );
		array[0] = "american hawk";
		stringList.add("Bird");
		System.out.println( stringList );
	}
}
