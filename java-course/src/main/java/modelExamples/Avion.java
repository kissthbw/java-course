package modelExamples;

public class Avion {

	private String velocidad;
	private String peso;
	private String numeroTurbina;

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getNumeroTurbina() {
		return numeroTurbina;
	}

	public void setNumeroTurbina(String numeroTurbina) {
		this.numeroTurbina = numeroTurbina;
	}

	public Avion(String velocidad, String peso, String numeroTurbina) {
		this.velocidad = velocidad;
		this.peso = peso;
		this.numeroTurbina = numeroTurbina;
	}
}
