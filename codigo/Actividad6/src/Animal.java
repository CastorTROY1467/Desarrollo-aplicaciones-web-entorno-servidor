public class Animal {
	private String nombre;
	private float precio;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Animal(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Animal");
		System.out.println("------");
		System.out.println("Nombre común :: " + this.nombre);
		System.out.printf("Precio :: %.2f €", this.precio);
	}
}
