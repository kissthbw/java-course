package com.examples.string;

public class StringBuilderExamples {

	// TODO: Adrian crea en esta clase un metodo que determine si una cadena
	// es palindromo o no

	public boolean esPalindromo(String cadena) {
		
		cadena = cadena.trim();
		StringBuilder ejercicio = new StringBuilder(cadena);
		String invertida = ejercicio.reverse().toString();
		
		System.out.println(cadena);
		System.out.println(invertida);
		System.out.println("Son iguales: " + invertida.equalsIgnoreCase(cadena));
		
		return invertida.equalsIgnoreCase(cadena);
	}

	public static void main(String[] args) {
		
		StringBuilderExamples ejemplo = new StringBuilderExamples();
		String c = " oXxO ";
		ejemplo.esPalindromo(c);

		// Las instancias de la clase String son inmutables
		// asi que cada concatenacion a alpha devuelve un nuevo objeto
		// donde el objeto previo es candidato al garbage collector
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}

		System.out.println(alpha);

		// Las instancias de la clase StringBuilder son mutables
		// asi que cada concatenacion, se modifica el tamanio del
		// objeto y se adjunta la nueva cadena al final del objeto
		StringBuilder sbAlpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++) {
			sbAlpha.append(current);
		}

		System.out.println(sbAlpha);

		// Llamadas encadenadas
		// String al ser un objeto inmutable siempre devuelve una referencia a
		// un nuevo objeto
		String text1 = "Juan Osorio Alvarez";
		text1.toUpperCase();
		System.out.println(text1);

		// StringBuilder al ser un objeto mutable, cualquier metodo usado
		// realmente afecta a la referencia a la cual se esta apuntando
		// por lo que no es necesario almacenar el valor de retorno
		StringBuilder text2 = new StringBuilder("Juan Osorio Alvarez");
		text2.append(".");
		System.out.println(text2);

		StringBuilder a = new StringBuilder("Hola");
		StringBuilder b = new StringBuilder("Hola");

		// Compara espacion en memoria
		System.out.println(a.equals(b));
		System.out.println(a == b);

		// Si quiero comparar el contenido primero paso a String,
		// con el metodo toString
		System.out.println(a.toString().equals(b.toString()));

		StringBuilder sql = new StringBuilder("");
		sql.append("INSERT INTO ");
		sql.append("tabla ");
		sql.append("VALUES ");

		System.out.println(sql.toString());

		StringBuilder sb = new StringBuilder("palabra");
		sb.reverse();

		System.out.println(sb.toString());
		String s = "Anita lava la tina";
		StringBuilder sb2 = new StringBuilder(s);
		System.out.println(sb2.toString());
	}
}
