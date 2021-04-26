package PaquetePersona;

public class Persona {
	private String nombre;
	private String nacionalidad;
	private int edad;

	/**
	 * @param nombre
	 * @param nacionalidad
	 * @param edad
	 */
	public Persona(String nombre, String nacionalidad, int edad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrar() {
		System.out.println("Nombre :: " + this.nombre);
		System.out.println("Nacionalidad :: " + this.nacionalidad);
	}
}
