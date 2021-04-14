import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Cliente> clientes;


	/**
	 * @param nombre
	 */
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void agregar(Cliente c) {
		clientes.add(c);
	}
	
	public void mostrarClientes() {
		System.out.println("Lista Clientes - " + this.nombre);
		System.out.println("-----------------------------------------------------------------");
		
		/**
		 * Recorremos el ArrayList de Clientes y llamamos al metodo mostrar de cada uno de ellos
		 */
		
		for (int i = 0; i < clientes.size(); i++) {
			clientes.get(i).mostrar();
		}
		
//		for (Cliente cliente : clientes) {
//			cliente.mostrar();
//		}
	}
	
	public void imprimirGanancias() {
		System.out.println();
		System.out.printf("La empresa " + this.nombre + " ha obtenido unas ganancias de: %.2f €", calcularGanancias());
		System.out.println();
	}
	
	private double calcularGanancias() {
		double ganancias = 0;
		for(Cliente cliente : clientes) {
			ganancias += cliente.getCantidadPagada();
		}
		
		return ganancias;
	}
}
