public class Venta {
	private String id;
	private String fechaVenta;
	private String dniCliente;
	private Coche coche;
	
	/**
	 * @param id
	 * @param fechaVenta
	 * @param dniCliente
	 * @param coche
	 */
	public Venta(String id, String fechaVenta, String dniCliente, Coche coche) {
		this.id = id;
		this.fechaVenta = fechaVenta;
		this.dniCliente = dniCliente;
		this.coche = coche;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("ID Venta :: " + this.id);
		System.out.println("Fecha Venta :: " + this.fechaVenta);
		System.out.println("DNI Cliente:: " + this.dniCliente);
		System.out.println("Coche :: " + this.coche.getMarca() + " " + this.coche.getModelo());
		System.out.println("Cantidad :: " + this.coche.getPrecio());
		System.out.println("-----------------------------------------------------");
		System.out.println();
	}
}
