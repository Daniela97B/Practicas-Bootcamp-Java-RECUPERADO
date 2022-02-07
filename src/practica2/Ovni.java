package practica2;

public class Ovni extends Voladores  {
	
	private String origen;
	private int pasajeros;
	
	public Ovni(String nombre, String marca, String color, String tamaño, String origen, int pasajeros) {
		super(nombre, marca, color, tamaño);
		this.origen = origen;
		this.pasajeros = pasajeros;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	@Override
	public String toString() {
		return "Ovni [origen=" + origen + ", pasajeros=" + pasajeros + "]";
	}
	
	
	

}
