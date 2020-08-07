package modelExamples;

public class Tren {

	private String peso;
	private String totalArrastre;
	private String tipoCombustible;

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTotalArrastre() {
		return totalArrastre;
	}

	public void setTotalArrastre(String totalArrastre) {
		this.totalArrastre = totalArrastre;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public Tren(String peso, String totalArrastre, String tipoCombustible) {
		this.peso = peso;
		this.totalArrastre = totalArrastre;
		this.tipoCombustible = tipoCombustible;
	}
}
