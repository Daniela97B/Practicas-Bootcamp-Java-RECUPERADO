package practica5;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	public static int opciones(Scanner sc) {
	
			System.out.println("INGRRESE LA OPCION DESEADA");
			System.out.println("1.Inscribir materia");
			System.out.println("2.Buscar inscripcion");
			System.out.println("3.Eliminar inscripcion");
			System.out.println("4.Salir");
			int opcion=sc.nextInt();
			
			return opcion;
	}
					
   public static Set<Alumno>registrarAlumnos (Scanner sc) {
	   
	  System.out.println("¿Cuantos estudiantes desea ingresar?"); 
	  int numeroEstudiantes=sc.nextInt();
	  
	  Set<Alumno> alumnos = new HashSet<>();
	   
	for (int i=0; i<numeroEstudiantes; i++) {
		System.out.println("Ingrese nombre del estudiante");
		String nombre=sc.next();
		System.out.println("Ingrese apellido del estudiante");
		String apellido=sc.next();
		System.out.println("Ingrese id del estudiante");
		int id=sc.nextInt();
		
		Alumno alumno = new Alumno( nombre, id, apellido);
	    alumnos.add(alumno);

	}
	return alumnos;
   }
   public static Set<Materia>registrarMateria (Scanner sc) {
	   
		  System.out.println("¿Cuantos materias desea ingresar?"); 
		  int numeroMaterias=sc.nextInt();
		  
		  Set<Materia> materias = new HashSet<>();
		   
		for (int i=0; i<numeroMaterias; i++) {
			System.out.println("Ingrese id de la materia");
			int  id=sc.nextInt();
			System.out.println("Ingrese a que curso pertenece la materia");
			String curso=sc.next();
			System.out.println("Ingrese turno de la materia");
			String turno=sc.next();
			
			Materia materia= new Materia( id,curso,turno);
		    materias.add(materia);

		}
		return materias;
		
   }
   
   
}


