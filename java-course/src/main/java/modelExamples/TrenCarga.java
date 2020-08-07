package modelExamples;

public class TrenCarga extends Tren {

	private String tipoCarga;
	private String totalVagon;

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public String getTotalVagon() {
		return totalVagon;
	}

	public void setTotalVagon(String totalVagon) {
		this.totalVagon = totalVagon;
	}

	public TrenCarga(String peso, String totalArrastre, String tipoCombustible,
			String tipoCarga, String totalVagon) {
		super(peso, totalArrastre, tipoCombustible);
		this.tipoCarga = tipoCarga;
		this.totalVagon = totalVagon;
	}
}
