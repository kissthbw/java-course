package com.examples.model;

public class AlumnoBecado extends Alumno{
	
	private double porcentajeBeca;
	private String periodoValidez;
	
	public double getPorcentajeBeca() {
		return porcentajeBeca;
	}

	public void setPorcentajeBeca(double porcentajeBeca) {
		this.porcentajeBeca = porcentajeBeca;
	}

	public String getPeriodoValidez() {
		return periodoValidez;
	}

	public void setPeriodoValidez(String periodoValidez) {
		this.periodoValidez = periodoValidez;
	}
	
	public AlumnoBecado(String nombre, String apellidoPaterno, String apellidoMaterno,
			String numeroLista, double porcentajeBeca, String periodoValidez) {
		super(nombre, apellidoPaterno, apellidoMaterno, numeroLista);
		
		this.porcentajeBeca = porcentajeBeca;
		this.periodoValidez = periodoValidez;
	}
	
	public static void main(String[] args) {
		AlumnoBecado a = new AlumnoBecado("Adrian", "Osorio", "Alvarez", "31", 100.0, "6 meses");
		System.out.println("Alumno: " + a.getNombre() + " " + a.getApellidoPaterno() + " "
				+ a.getApellidoMaterno() + "\nNumero de lista: " + a.getNumeroLista()
				+ "\nPorcentaje de beca: " + a.getPorcentajeBeca() + "\nPeriodo de validez: "
				+ a.getPeriodoValidez());
	}
}
