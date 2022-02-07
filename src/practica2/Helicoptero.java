package practica2;

public class Helicoptero extends Avion implements Aterrizable {
	
	 private int numeroPasajeros;
	 private String modelo;
	 
	public Helicoptero(String nombre, String marca, String color, String tamaño, String modeloAvion, int pasajerosAvion,
			int numeroPasajeros, String modelo) {
		super(nombre, marca, color, tamaño, modeloAvion, pasajerosAvion);
		this.numeroPasajeros = numeroPasajeros;
		this.modelo = modelo;
	}
	
	public Resultado Aterrizar() {
		
		System.out.println("El helicoptero puede aterrizar");
		
		return null ;
	}
	
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Helicoptero [numeroPasajeros=" + numeroPasajeros + ", modelo=" + modelo + "]";
	}
	 

}
