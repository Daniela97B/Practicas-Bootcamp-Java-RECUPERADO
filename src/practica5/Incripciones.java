package practica5;

import java.util.Objects;

public class Incripciones {
	
	private int idMateria;
	private int idEstudiante;
	private int idInscripcion;
	
	public Incripciones(int idMateria, int idEstudiante, int idInscripcion) {
		super();
		this.idMateria = idMateria;
		this.idEstudiante = idEstudiante;
		this.idInscripcion = idInscripcion;
	}
	public int getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	public int getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public int getIdInscripcion() {
		return idInscripcion;
	}
	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idInscripcion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incripciones other = (Incripciones) obj;
		return idInscripcion == other.idInscripcion;
	}
	@Override
	public String toString() {
		return "Incripciones [idMateria=" + idMateria + ", idEstudiante=" + idEstudiante + ", idInscripcion="
				+ idInscripcion + "]";
	}

}
