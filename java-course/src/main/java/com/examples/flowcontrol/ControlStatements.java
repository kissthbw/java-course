package com.examples.flowcontrol;

public class ControlStatements {

	// Definicion de constantes
	private static final double CALIFICACION_APROBATORIA = 7.0;
	private static final double CALIFICACION_SOBRESALIENTE = 9.0;
	private static final double CALIFICACION_EXCELENTE = 10.0;
	private static final String CALIFICACION_A = "A";
	private static final String CALIFICACION_B = "B";
	private static final String CALIFICACION_C = "C";

	public static void main(String[] args) {
		// If, else if, else
		// Esta sentencia de control evalua una expresion booleana,
		// donde, si es true hace algo y si false hace otra cosa
		double calificacion = 9.9;

		if (calificacion >= CALIFICACION_APROBATORIA) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Reprobado");
		}

		// Ejemplo 2, multiples evaluaciones con if, else if... else
		if (calificacion >= CALIFICACION_APROBATORIA && calificacion < CALIFICACION_SOBRESALIENTE) {
			System.out.println("Aprobado");
		} else if (calificacion >= CALIFICACION_SOBRESALIENTE && calificacion < CALIFICACION_EXCELENTE) {
			System.out.println("Aprobado... felicidades");
		} else if (calificacion == CALIFICACION_EXCELENTE) {
			System.out.println("Aprobado... calificacion perfecta");
		} else {
			System.out.println("Reprobado");
		}

		// TODO: Tarea hacer un ejemplo que avalue las notas en base a letras:
		// Si la nota es A imprimir mensaje excelente
		// Si la nota es B imprimir mensaje de sobresalienta
		// Si el mensaje es C imprimir mensaje de aprobado
		// Si no es ninguna de esatas opciones reprobado
		// Nota para comprara cadenas usamos el metodo equals, o equalsIgnoeCase

		String calificacion1 = "a";

		if (calificacion1.equalsIgnoreCase(CALIFICACION_C)) {
			System.out.println("Aprobado");
		} else if (calificacion1.equalsIgnoreCase(CALIFICACION_B)) {
			System.out.println("Sobresaliente");
		} else if (calificacion1.equalsIgnoreCase(CALIFICACION_A)) {
			System.out.println("Excelente");
		} else {
			System.out.println("Reprobado");
		}
		
		/*
		 * Uso de switch
		 * Nota, permite evaluar int, boolean, String, enums
		 */
		System.out.println( "Uso de switch" );
		int cal = 9;
		switch (cal) {
		case 7:
			System.out.println("Aprobado");
			break;
		case 8:
			System.out.println("Aprobado... buen trabajo");
			break;
		case 9:
			System.out.println("Aprobado... sobresaliente");
			break;
		case 10:
			System.out.println("Aprobado... perfecto");
			break;
		default:
			System.out.println("Reprobado");
			break;
		}
		
		String tipoMembresia = "GOLD";
		switch (tipoMembresia) {
		case "BRONZE":
			System.out.println( "Servicios basicos" );
			break;
		case "SILVER":
			System.out.println( "Servicios basicos + valet parking" );
			break;
		case "GOLD":
			System.out.println( "Todos los servicios" );
			break;
		default:
			System.out.println( "Menbresia no catalogada" );
			break;
		}
		
		String tipoUsuario = "SUPER";
		switch (tipoUsuario) {
		case "NORMAL":
			break;
		case "SUPER":
			break;
		}
		
		
	}
}
