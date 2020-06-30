package com.examples.flowcontrol;

public class ControlStatementsClass {
	
	public ControlStatementsClass() {
		
	}
	
	private static final double CALIFICACION_APROBATORIA = 7.0;
	private static final double CALIFICACION_SOBRESALIENTE = 9.0;
	private static final double CALIFICACION_EXCELENTE = 10.0;
	
	//TODO: Adrian, termina este metodo con todos los casos contemplados en la
	//clase ControlStaements
	public String verificaCalificacionAlumno( double calificacion ) {
		
		//Verifica si el alumno esta aprobado y retorna su estatus
		String status = "reprobado";
		
		if( calificacion >= CALIFICACION_APROBATORIA && calificacion < CALIFICACION_SOBRESALIENTE ) {
			status = "aprobado";
		}
		
		return status;
		
	}
	
	//TODO: Adrian, crea un metodo X que recibe una variable de tipo String
	//que evalue los siguientes casos:
	//A+ = "Aprobado excelente"
	//A = "Aprobado felicidades"
	//B = "Aprobado sobresaliente"
	//C = "Aprobado"
	//Y devolver el esttaus de le evaluacion
	
	public static void main(String[] args) {
		double calificacion = 6.0;
		
		ControlStatementsClass control = new ControlStatementsClass();
		String status = control.verificaCalificacionAlumno( calificacion );
		System.out.println( status );
	}
}
