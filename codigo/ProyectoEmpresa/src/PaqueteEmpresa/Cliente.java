package PaqueteEmpresa;

public class Cliente extends Persona {
	private String direccion;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 */
	public Cliente(String nombre, String apellidos, String direccion) {
		super(nombre, apellidos);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Direccion :: " + this.direccion);
	}

	@Override
	public void mostrarAlta() {
		System.out.println("Se ha creado un nuevo objeto Cliente!");
	}
}
