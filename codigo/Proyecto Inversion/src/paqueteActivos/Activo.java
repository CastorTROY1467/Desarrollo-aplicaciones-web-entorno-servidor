package paqueteActivos;

public abstract class Activo {
	private String simbolo;
	private String nombre;
	private double cantidad;
	private double cotizacion;
	private String fechaCompra;
	
	/**
	 * @param simbolo
	 * @param nombre
	 * @param fechaCompra
	 */
	public Activo(String simbolo, String nombre, double cotizacion, String fechaCompra) {
		this.simbolo = simbolo;
		this.nombre = nombre;
		this.cantidad = 0;
		this.cotizacion = cotizacion;
		this.fechaCompra = fechaCompra;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	public double getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	public void mostrarInformacion() {
		System.out.println(this.nombre);
		System.out.println("------------------------------------\n");
		System.out.println("Simbolo: " + this.simbolo);
		System.out.println("Cantidad: " + this.cantidad);
		System.out.println("Cotizacion hoy: " + this.cotizacion);
		System.out.println();
	}

	public abstract double comprar(int numero);
	public abstract double vender(int numero);
	
}
