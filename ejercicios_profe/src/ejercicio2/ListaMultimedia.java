package ejercicio2;
// Importamos las clases del ejercicio 1
import ejercicio1.Multimedia;

import java.util.Arrays;

import ejercicio1.Formato;

public class ListaMultimedia {
	private Multimedia vector[];
	private int contador;
	private int tamanho;
	
	public ListaMultimedia(int tamanho) {
		super();
		this.contador = 0;
		this.tamanho = tamanho;
		vector = new Multimedia[tamanho];
	}
	
	int size() {
		return contador;
	}
	/*
	 * A�ade el objeto a la lista y
	 * devuelve true, en caso de que la lista est� llena, devuelve false.
	 */
	boolean add(Multimedia m) {
		boolean insertado = false;
		
		if(contador<tamanho) {
			vector[contador] = m;
			contador++;
			insertado = true;
		}
		
		return insertado;
	}
	
	/*
	 * devuelve el objeto situado en la posici�n especificada
	 */
	Multimedia get(int position) {
		Multimedia aux = null;
		
		if(position<tamanho) {
			aux = vector[position];
		}
		
		return aux;
	}

	/*
	 * devuelve la informaci�n de los objetos que est�n en la lista @Override
	 */
	public String toString() {
		String result = "ListaMultimedia [contador=" + contador + ", tamaño=" + tamanho
				+ "]" + " Vector: \n";
		
		// Cada objeto muestra seg�n la clase de objeto que es (Pelicula o Multimedia)
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] != null) {
				result += vector[i].toString() + "\n";
			}
		}
		
		return result;
	}

}
