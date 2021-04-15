public class Persona {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private String dni;
	private int edad;
	private String sexo;
	
	/**
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param dni
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, String apellido, String fechaNacimiento, String dni, int edad, String sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	/**
	 * Muestra los datos de un objeto persona.
	 */
	public void mostrar() {
		System.out.println();
		System.out.println("Nombre :: " + this.nombre);
		System.out.println("Apellidos :: " + this.apellido);
		System.out.println("DNI :: " + this.dni);
		System.out.println("Fecha de nacimiento :: " + this.fechaNacimiento);
		System.out.println("Edad :: " + this.edad);
		System.out.println("Sexo :: " + this.sexo);
	}
}
