package practica5;

import java.util.HashSet;
import java.util.Set;

public class DatosDBMemoria {
	
	private Set<Incripciones> inscripciones= new HashSet<>();
	
	
	public Set<Incripciones> getInscripciones() {
		return inscripciones;
	}
	public void crearInscripciones(Incripciones inscripcion) {
	inscripciones.add(inscripcion);
	
	System.out.println("Se ha creado una inscripcion"+inscripcion.getIdInscripcion());
	}
	public void buscarInscripcion(int idInscripcion) {
		
	for (Incripciones aux: inscripciones) {
		int encontrados=0;
		
		if (aux.getIdInscripcion()==idInscripcion) {
			encontrados++;
			System.out.println(aux);
		}
		if (encontrados==0) {
			
			System.out.println("Incripcion no encontrada");
		}
	}
 }
	public void eliminarInscripcion (int idInscripcion) {
		for (Incripciones aux: inscripciones) {
			int encontrados=0;
			
		    if(aux.getIdInscripcion()==idInscripcion) {
		    	encontrados++;
		    	inscripciones.remove(aux);
		    	System.out.println("Se elimino la inscripcion de id:"+idInscripcion);
		    }
		    
		    if (encontrados==0) {
				
				System.out.println("Incripcion no encontrada");
			}
		}
			
			
		}
	
	}
	
	
