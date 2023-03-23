package ejercicio6;

import java.util.Objects;

public class Estudiante extends Persona{
	private int curso;

	public Estudiante(String nombre, String dni, String estadoCivil, int curso) {
		super(nombre, dni, estadoCivil);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}
	// Matriculaci�n de un estudiante en un nuevo curso
	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", curso=" + curso
				+ "]";
	}	
}
