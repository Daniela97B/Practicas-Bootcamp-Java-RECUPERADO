package practica2;

public abstract class Voladores {
	
	protected  String nombre;
	protected  String marca;
	protected  String color;
	protected  String tama�o;
	
	public Voladores(String nombre, String marca, String color, String tama�o) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	

}
