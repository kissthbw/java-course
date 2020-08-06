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
	
	public AlumnoBecado(String nombre, String apellidoPaterno, String apellidoMaterno, String numeroLista) {
		super(nombre, apellidoPaterno, apellidoMaterno, numeroLista);
		
	}
}
