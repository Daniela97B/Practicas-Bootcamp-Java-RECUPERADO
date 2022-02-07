package practica2;

public class Superman  extends Voladores  {
	
	private String escudo;

	public Superman(String nombre, String marca, String color, String tama�o, String escudo) {
		super(nombre, marca, color, tama�o);
		this.escudo = escudo;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	@Override
	public String toString() {
		return "Superman [escudo=" + escudo + "]";
	}



}
