package ejercicio2;

import ejercicio1.Formato;
import ejercicio1.Multimedia;
import ejercicio1.Pelicula;
import ejercicio1.Sexo;

public class Principal {
	public static void main(String[] args) {
		// Se cree un objeto de tipo ListaMultimedia de tama�o 10.
		ListaMultimedia lista = new ListaMultimedia(10);
		
		// Se creen tres pel�culas y se a�adan a la lista.
		Pelicula peli1 = new Pelicula("El padrino", "Francis", Formato.MOV, 220, "Sofía",Sexo.ACTRIZ);
		Pelicula peli2 = new Pelicula("El padrino II", "Francis", Formato.MOV, 220, "Rober","Sofía");
		Pelicula peli3 = new Pelicula("El padrino III", "Francis", Formato.MOV, 220, "Sofía",Sexo.ACTRIZ);
		Multimedia multi = new Multimedia("Purple Haze", "Jimmy", Formato.MP3, 49);
		
		lista.add(multi);
		lista.add(peli1);
		lista.add(peli2);
		lista.add(peli3);
		
		// Se muestre la lista por pantalla
		System.out.println(lista);
	}
}
