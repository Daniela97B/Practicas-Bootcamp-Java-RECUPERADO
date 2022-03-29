package practica5;

import java.util.Scanner;
import java.util.Set;

public class Aplicacion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			Set<Alumno>alumnos=Menu.registrarAlumnos(sc);
			Set<Materia>materias=Menu.registrarMateria(sc);
			DatosDBMemoria db = new DatosDBMemoria();
			
		    int opcion=0;
		    
		    while (opcion!= 4) {
		    	
		    	opcion=Menu.opciones(sc);
		    	
		    	if (opcion ==1) {
		    		
		    		System.out.println("Ingrese id del estudiante");
		    		int idEstudiante=sc.nextInt();
		    		System.out.println("Ingrese id de la materia");
		    		int idMateria=sc.nextInt();
		    		System.out.println("Ingrese id de la inscripcion");
		    		int idInscripcion=sc.nextInt();
		    		
		    		Incripciones inscripciones = new Incripciones(idMateria, idEstudiante, idInscripcion);
		    		
		    		db.crearInscripciones(inscripciones);
		    		
		    	}
		    	else if(opcion ==2 ) {
		    		System.out.println("Ingrese el id de la inscripcion que desea buscar");
		    		int idInscripcion =sc.nextInt();
		    		db.buscarInscripcion(idInscripcion);

		    	}
		    	else if (opcion ==3) {
		    		System.out.println("Ingrese el id de la inscripcion que desea eliminar");
		    		int idInscripcion =sc.nextInt();
		    		db.eliminarInscripcion(idInscripcion);
		    	}
		    	
		    	else if (opcion ==4) {
		    		
		    		System.out.println("salir");
		    	}
		    }
		    

}
}
