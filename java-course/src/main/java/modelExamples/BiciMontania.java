package modelExamples;

public class BiciMontania extends Bicicleta {

	private String tipoSuspension;

	public String getTipoSuspension() {
		return tipoSuspension;
	}

	public void setTipoSuspension(String tipoSuspension) {
		this.tipoSuspension = tipoSuspension;
	}

	public BiciMontania(String tamanio, String color, double precio, String tipoSuspension) {
		super(tamanio, color, precio);

		this.tipoSuspension = tipoSuspension;
	}

	public static void main(String[] args) {

		BiciMontania a = new BiciMontania("Mediana", "Rojo", 1500.99, "Suspension doble");
		System.out.println("Bici de Montaña: " + "\nTamaño: " + a.getTamanio() + " Color: "
				+ a.getColor() + " Precio: " + a.getPrecio() + " Suspension: " + a.getTipoSuspension());
	}
}
