package practica2;

public class Avion extends Voladores implements Aterrizable {
	
	private String modeloAvion;
	private int    pasajerosAvion;
	
	public Avion(String nombre, String marca, String color, String tamaño, String modeloAvion, int pasajerosAvion) {
		super(nombre, marca, color, tamaño);
		this.modeloAvion = modeloAvion;
		this.pasajerosAvion = pasajerosAvion;
	}

	public int getPasajerosAvion() {
		return pasajerosAvion;
	}

	public void setPasajerosAvion(int pasajerosAvion) {
		this.pasajerosAvion = pasajerosAvion;
	}

	public String getModeloAvion() {
		return modeloAvion;
	}

	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}



	
	
	@Override
	public Resultado Aterrizar() {
		System.err.println("El avion puede aterrizar en la pista");
		return null;
	}
	

}
