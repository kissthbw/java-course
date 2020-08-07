package modelExamples;

public class Bicicleta {
	private String tamanio;
	private String color;
	private double precio;

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Bicicleta(String tamanio, String color, double precio) {
		this.tamanio = tamanio;
		this.color = color;
		this.precio = precio;
	}
}
