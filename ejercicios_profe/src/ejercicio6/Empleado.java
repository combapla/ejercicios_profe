package ejercicio6;

public class Empleado extends Persona {
	private int anhoIncorporacion;
	private int numDespacho;
	
	public Empleado(String nombre, String dni, String estadoCivil, int anhoIncorporacion, int numDespacho) {
		super(nombre, dni, estadoCivil);
		this.anhoIncorporacion = anhoIncorporacion;
		this.numDespacho = numDespacho;
	}

	public int getNumDespacho() {
		return numDespacho;
	}
	// Reasignacinhn despacho empleado
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + ", estadoCivil=" + estadoCivil + ", anhoIncorporacion="
				+ anhoIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
}
