package ejercicio1;

public class Pelicula extends Multimedia {
	private String actorPrincipal;
	private String actrizPrincipal;

	public Pelicula(String titulo, String autor, Formato formato, int duracion, String actorPrincipal,
			String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}

	public Pelicula(String titulo, String autor, Formato formato, int duracion, 
			String nombre, Sexo sexo) {
		super(titulo, autor, formato, duracion);
		if(sexo==Sexo.ACTOR) {
			this.actorPrincipal = nombre;
			this.actrizPrincipal = null;
		}
		else {
			this.actorPrincipal = null;
			this.actrizPrincipal = nombre;
		}
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	// toString
	public String toString() {
		return super.toString()+
				"[actor: "+actorPrincipal+
				", actriz: "+actrizPrincipal+"]";
	}
}
