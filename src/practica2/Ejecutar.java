package practica2;

public class Ejecutar {
	
	
	public static void main(String[] args) {
		
		Avion a = new Avion("Avianca", "Boeing", "Grande", "Blanco", "Z", 23);
		Helicoptero h = new Helicoptero("Comercial", "KIA", "pequeño", "gris", "y", 4, 0, "M");
		Superman s = new Superman("Black", "superheroe", "Gigante", "negro", "S");
		Ovni o = new Ovni("Marte","xxv","miniatura", "azul", "Mercurio", 1);
		
		Voladores[] voladores = new Voladores[] {a,h,s,o};
		
		for (Voladores obj: voladores ) {
			
			if (obj instanceof Aterrizable){
				
				Aterrizable ate = (Aterrizable)obj;
				Resultado res = ate.Aterrizar();
			}else {
				System.out.println("No puede aterrizar"+obj);
				
			}
		}
	}
	
	

}
