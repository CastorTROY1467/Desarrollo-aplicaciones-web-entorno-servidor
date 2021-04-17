import java.util.ArrayList;

public class Pez extends Animal{
	private ArrayList<Pez> pecesIncompatibles;
	
	/**
	 * @param nombre
	 * @param precio
	 * @param pecesIncompatibles
	 */
	public Pez(String nombre, float precio, ArrayList<Pez> pecesIncompatibles) {
		super(nombre, precio);
		this.pecesIncompatibles = pecesIncompatibles;
	}
		
	public ArrayList<Pez> getPecesIncompatibles() {
		return pecesIncompatibles;
	}

	public void setPecesIncompatibles(ArrayList<Pez> pecesIncompatibles) {
		this.pecesIncompatibles = pecesIncompatibles;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println();
		System.out.println("\nPeces incompatibles");
		System.out.println();
		for(Pez pez : this.pecesIncompatibles) {
			System.out.println(pez.getNombre());
		}
	}
}
