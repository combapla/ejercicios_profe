package ejercicio6;

public class PersonalServicio extends Empleado{
	private Seccion seccion;

	public PersonalServicio(String nombre, String dni, String estadoCivil, int anhoIncorporacion, int numDespacho,
			Seccion seccion) {
		super(nombre, dni, estadoCivil, anhoIncorporacion, numDespacho);
		this.seccion = seccion;
	}
	
	public Seccion getSeccion() {
		return seccion;
	}
	// Traslado de seccion de un empleado del personal de servicio
	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return "PersonalServicio [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", seccion="
				+ seccion + "]";
	}
}
