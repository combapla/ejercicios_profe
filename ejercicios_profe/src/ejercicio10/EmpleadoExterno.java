package ejercicio10;

public class EmpleadoExterno extends Empleado {
	private String empresa;

	public EmpleadoExterno(String nombre, String dni, String direccion, int telefono, int horas, double beneficio,
			String empresa) {
		super(nombre, dni, direccion, telefono, horas, beneficio);
		this.empresa = empresa;
	}
	
	
}
