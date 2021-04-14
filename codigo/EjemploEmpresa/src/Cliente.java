
public class Cliente {
	private String nombre;
	private String apellidos;
	private String email;
	private String fechaPago;
	private double cantidadPagada;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param fechaPago
	 * @param cantidadPagada
	 */
	public Cliente(String nombre, String apellidos, String email, String fechaPago, double cantidadPagada) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fechaPago = fechaPago;
		this.cantidadPagada = cantidadPagada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getCantidadPagada() {
		return cantidadPagada;
	}

	public void setCantidadPagada(double cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
	}

	public void mostrar() {
		System.out.println();
		System.out.println("Nombre :: " + this.nombre);
		System.out.println("Apellidos :: " + this.apellidos);
		System.out.println("Email :: " + this.email);
		System.out.println("Fecha pago:: " + this.fechaPago);
		System.out.println("Cantidad pagada :: " + this.cantidadPagada + " €");
	}
}
