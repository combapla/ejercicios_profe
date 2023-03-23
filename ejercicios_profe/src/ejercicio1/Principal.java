package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Multimedia multi = new Multimedia("El padrino", "Francis",Formato.DVD, 220 );
		System.out.println(multi);
		Pelicula peli = new Pelicula("El padrino", "Francis",Formato.MOV, 220, "Joana", Sexo.ACTRIZ);
		System.out.println(peli);
		Pelicula peli2 = new Pelicula("El padrino 2", "Francis",Formato.WAV, 250, "Joan", "Joana");
		System.out.println(peli2);
		
		if (peli.equals(peli2)) {
			System.out.println("Las pelis son iguales");
		}
		else
			System.out.println("Las pelis son distintas");
	}
}
