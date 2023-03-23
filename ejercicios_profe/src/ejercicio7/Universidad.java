package ejercicio7;

import ejercicio6.*;

public class Universidad {
	private Persona personas[];
	private int tamanho;

	public Universidad(int tamanho) {
		this.tamanho = tamanho;
		personas = new Persona[tamanho];
	}

	public boolean addPersona(Persona persona) {
		boolean insertado = false;
		for (int i = 0; i < personas.length && !insertado; i++) {
			if (personas[i]==null) {
				personas[i] = persona;
				insertado = true;
			}
		}
		return insertado;
	}

	// cambiarnh el curso a un Estudiante. 
	public void cambiarCurso (String dni, int nuevoCurso) {
		for (int i = 0; i < personas.length; i++) {
			// Si la posicinhn no estnh vacnha
			if(personas[i]!=null) {
				// Si el DNI es el que he recibido
				if(personas[i].getDni().equals(dni)) {
					// Si el objeto es de clase Estudiante cambio el curso
					if (personas[i] instanceof Estudiante) {
						Estudiante estudiante = (Estudiante)personas[i];
						estudiante.setCurso(nuevoCurso);
					}
				}
			}
		}
	}

	// cambiarnh el departamento a un Profesor
	public void cambiarDepartamento (String dni, Departamento departamento) {
		for (int i = 0; i < personas.length; i++) {
			// Si la posicinhn no estnh vacnha
			if(personas[i]!=null) {
				// Si el DNI es el que he recibido
				if(personas[i].getDni().equals(dni)) {
					// Si el objeto es de clase Profesor cambio el departamento
					if (personas[i] instanceof Profesor) {
						Profesor profesor = (Profesor)personas[i];
						profesor.setDepartamento(departamento);
					}
				}
			}
		}
	}

	// cambiarnh la seccion a un Personal de Servicios
	public void cambiarSeccion (String dni, Seccion seccion) {
		for (int i = 0; i < personas.length; i++) {
			// Si la posicinhn no estnh vacnha
			if(personas[i]!=null) {
				// Si el DNI es el que he recibido
				if(personas[i].getDni().equals(dni)) {
					// Si el objeto es de clase Personal cambio el curso
					if (personas[i] instanceof PersonalServicio) {
						PersonalServicio currante = (PersonalServicio)personas[i];
						currante.setSeccion(seccion);
					}
				}
			}
		}
	}

	public void listarEmpleados() {
		for (int i = 0; i < personas.length; i++) {
			if(personas[i]!=null) {
				// tengo que comprobar primero si es un profe o personal de servicio
				if(personas[i] instanceof Empleado) {
						System.out.println(personas[i]);
				}
			}
		}
	}

	public void listarProfesoresDepartamento(Departamento dep) {
		for (int i = 0; i < personas.length; i++) {
			if(personas[i]!=null) {
				// tengo que comprobar primero si es un profe
				if(personas[i] instanceof Profesor) {
					Profesor profe = (Profesor)personas[i];
					// y luego ver si es del departamento que me indican
					if(profe.getDepartamento() == dep) {
						// Si cumple todo lo muestro
						System.out.println(personas[i]);
					}
				}
			}
		}
	}

	public void listarTodos() {
		for (int i = 0; i < personas.length; i++) {
			if(personas[i]!=null) {
				System.out.println(personas[i]);
			}
		}
	}
}