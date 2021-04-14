public class Coche {
	private String marca;
	private String modelo;
	private String motor;
	private double precio;
	private boolean vendido;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param motor
	 * @param precio
	 * @param vendido
	 */
	public Coche(String marca, String modelo, String motor, double precio, boolean vendido) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.precio = precio;
		this.vendido = vendido;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Los Getters para atributos de tipo boolean cambian ligeramente.
	 * 
	 * Por una cuestion semantica, en vez de getVendido se crea isVendido que traducimos como: esta vendido y devuelve true o false.
	 * @return boolean
	 */
	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
	public void mostrar() {		
//		String vendido;
//		if(this.vendido)
//			vendido = "Si";
//		else
//			vendido = "No";
		
		/**
		 * Utilizamos el operador ternario de Java ?: que actúa igual que un if-else
		 */
		String vendido = this.vendido ? "Si" : "No";
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Marca :: " + this.marca);
		System.out.println("Modelo :: " + this.modelo);
		System.out.println("Motor :: " + this.motor);
		System.out.println("Precio:: " + this.precio + " €");
		System.out.println("Vendido :: " + vendido);
		System.out.println("-----------------------------------------------------");
		System.out.println();
	}
}
