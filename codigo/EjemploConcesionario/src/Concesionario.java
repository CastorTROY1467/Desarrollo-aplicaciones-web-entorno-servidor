import java.util.ArrayList;

public class Concesionario {
	private String nombre;
	private ArrayList<Coche> coches;
	private ArrayList<Venta> ventas;
	
	/**
	 * @param nombre
	 * @param coches
	 * @param ventas
	 */
	public Concesionario(String nombre) {
		this.nombre = nombre;
		this.coches = new ArrayList<Coche>();
		this.ventas = new ArrayList<Venta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public void setCoches(ArrayList<Coche> coches) {
		this.coches = coches;
	}

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void agregarCoche(Coche c) {
		coches.add(c);
	}
	
	public void agregarVenta(Venta v) {
		ventas.add(v);
	}
	
	public void mostrarCoches() {
		System.out.println("Coches");
		System.out.println("------");
		
		for (Coche coche : coches) {
			coche.mostrar();
		}
	}
	
	public void mostrarVentas() {
		double totalVentas = 0;
		
		System.out.println("Ventas");
		System.out.println("------");
		
		for (Venta venta : ventas) {
			venta.mostrar();
			totalVentas += venta.getCoche().getPrecio(); 
		}
		
		System.out.println("Total ventas :: " + totalVentas);
	}
}
