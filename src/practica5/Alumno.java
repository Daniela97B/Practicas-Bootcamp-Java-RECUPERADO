package practica5;

import java.util.Objects;
import java.util.Scanner;

public class Alumno {
		
	private String nombre;
	private int matricula;
	private String apellido;
	
	public Alumno(String nombre, int matricula, String apellido) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.apellido = apellido;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return matricula == other.matricula;
	}
	

}
