package practica1;

import java.util.Iterator;
import java.util.Scanner;

public class Estudiante {
	
	public static void main(String[] args) {
		
		int cont=0;
		int notaAlta=0;
		int notaBaja=0;
		int fila=0;
		int col=0;
		int suma=0;
		int cont2=0;
		int numeroExa=0;
		int sumaNotas=0;
		String auxNota;
		int promedioNotas=0;
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos estudiantes desea ingresar?");
		fila=sc.nextInt();
		System.out.println("¿Cuantos examenes desea ingresar por estudiante?");
		col=sc.nextInt();
		
		String[][] notas = new String[fila][2+col];
		
		int posicionFila=0;
		int posicionCol=0;
		
		while(cont<fila) {
			
			cont2=0;
			numeroExa=1;
			
			System.out.println("Ingrese nombre del estudiante "+  (posicionFila +1));
			notas[posicionFila][posicionCol] = sc2.nextLine();
			
			sumaNotas=0;
			while (cont2<col) {

				System.out.println("Ingrese la nota del examen" + numeroExa);
				notas[posicionFila][posicionCol+numeroExa] = sc2.nextLine();
				auxNota=(notas[posicionFila][posicionCol+numeroExa]);
				sumaNotas += Integer.parseInt(auxNota);
				//System.out.println(""+sumaNotas);
				
				cont2++;
				numeroExa++;
				}
			promedioNotas= (sumaNotas/col);
			notas[posicionFila][col+1] = String.valueOf(promedioNotas);
			
			
		cont++;
		posicionFila++;	
		}
		
		for(int i =0; i<fila; i++) {
			for(int j =0; j<col+2; j++) {
				System.out.print("{"+notas[i][j]+"}");
				
			}
			System.out.println("");	
		}
		
		// Nota mas alta
		   notaAlta=0;
		   notaBaja=11;
		   String nombreNotaAlta ="";
		   String nombreNotaBaja ="";
		   
		   
		for(int i =0; i<fila; i++){
			for(int j =col+1; j<col+2; j++) {
				if(Integer.parseInt(notas[i][j]) > notaAlta) {
						notaAlta=Integer.parseInt(notas[i][j]);
						nombreNotaAlta=notas[i][0];
							
						}
					//Nota mas baja	
				   
					if(Integer.parseInt(notas[i][j]) < notaBaja) {
						notaBaja=Integer.parseInt(notas[i][j]);
						nombreNotaBaja=notas[i][0];
	
						}
					
					}
					
				}
		
				System.out.println("El estudiante con la nota mas baja es :"+ nombreNotaBaja+ " nota: " +notaBaja);
				System.out.println("El estudiante con la nota mas alta es :"+ nombreNotaAlta + " nota: " +notaAlta);
			}		
		}		