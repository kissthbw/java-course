package modelExamples;

public class AvionPasajero extends Avion{

	private int totalPasajero;
	private String seccion;

	public int getTotalPasajero() {
		return totalPasajero;
	}

	public void setTotalPasajero(int totalPasajero) {
		this.totalPasajero = totalPasajero;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public AvionPasajero(String velocidad, String peso, String numeroTurbina,
			int totalPasajero, String seccion) {
		super(velocidad, peso, numeroTurbina);
		this.totalPasajero = totalPasajero;
		this.seccion = seccion;
	}
	
	public static void main(String[] args) {
		
		AvionPasajero a = new AvionPasajero("500 km/H", "1000 kg", "4", 135, "3");
	}
}
