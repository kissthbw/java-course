package com.examples.flowcontrol;

import java.lang.invoke.SwitchPoint;

public class ControlStatementsClass {

	public ControlStatementsClass() {

	}

	private static final double CALIFICACION_APROBATORIA = 7.0;
	private static final double CALIFICACION_SOBRESALIENTE = 9.0;
	private static final double CALIFICACION_EXCELENTE = 10.0;
	private static final String CALIFICACION_A1 = "A+";
	private static final String CALIFICACION_A = "A";
	private static final String CALIFICACION_B = "B";
	private static final String CALIFICACION_C = "C";
	private static final int CALIF_APROBATORIA = 7;
	private static final int CALIF_APROBATORIA1 = 8;
	private static final int CALIF_SOBRESALIENTE = 9;
	private static final int CALIF_EXCELENTE = 10;

	// TODO: Adrian, termina este metodo con todos los casos contemplados en la
	// clase ControlStaements
	public String verificaCalificacionAlumno(double calificacion) {

		// Verifica si el alumno esta aprobado y retorna su estatus
		String status = "reprobado";

		if (calificacion >= CALIFICACION_APROBATORIA && calificacion < CALIFICACION_SOBRESALIENTE) {
			status = "aprobado";
		} else if (calificacion >= CALIFICACION_SOBRESALIENTE && calificacion < CALIFICACION_EXCELENTE) {
			status = "sobresaliente";
		} else if (calificacion == CALIFICACION_EXCELENTE) {
			status = "excelente";
		}

		return status;
	}

	// TODO: Adrian, crea un metodo X que recibe una variable de tipo String
	// que evalue los siguientes casos:
	// A+ = "Aprobado excelente"
	// A = "Aprobado felicidades"
	// B = "Aprobado sobresaliente"
	// C = "Aprobado"
	// Y devolver el esttaus de le evaluacion

	public String verificarCalificacionesAlumno(String calif) {

		String status1 = "reprobado";

		if (calif.equals(CALIFICACION_C)) {
			status1 = "aprobado";
		} else if (calif.equals(CALIFICACION_B)) {
			status1 = "aprobado felicidades";
		} else if (calif.equals(CALIFICACION_A)) {
			status1 = "aprobado sobresaliente";
		} else if (calif.equals(CALIFICACION_A1)) {
			status1 = "aprobado excelente";
		}

		return status1;
	}

	public String verificaCalificacionAlumnoSwitch(String cal) {

		String status2 = "reprobado x2";

		switch (cal) {
		case "C":
			status2 = "aprobado";
			break;
		case "B":
			status2  = "aprobado felicidades";
			break;
		case "A":
			status2 = "aprobado sobresaliente";
			break;
		case "A+":
			status2 = "aprobado excelente";
			break;
		default:
			System.out.println(status2);
			break;
		}

		return status2;
	}

	public String verificaCalifAlumno(int alumnoCal) {

		String status3 = "reprobado x3";

		switch (alumnoCal) {
		case 7:
			status3 = "aprobado";
			break;
		case 8:
			status3 = "aprobado felicidades";
			break;
		case 9:
			status3 = "aprobado sobresaliente";
			break;
		case 10:
			status3 = "aprobado excelente";
			break;
		default:
			System.out.println(status3);
			break;
		}

		return status3;
	}

	public static void main(String[] args) {
		double calificacion = 10.0;
		String calif = "D";
		String cal = "A+";
		int alumnoCal = 8;

		ControlStatementsClass control = new ControlStatementsClass();
		String status = control.verificaCalificacionAlumno(calificacion);
		String status1 = control.verificarCalificacionesAlumno(calif);
		String status2 = control.verificaCalificacionAlumnoSwitch(cal);
		String status3 = control.verificaCalifAlumno(alumnoCal);
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
	}
}
