
public class Perro extends Animal{
	private String pedigri;
	
	/**
	 * @param nombre
	 * @param precio
	 * @param pedigri
	 */
	public Perro(String nombre, float precio, String pedigri) {
		super(nombre, precio);
		this.pedigri = pedigri;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println();
		System.out.println("Pedigri :: " + this.pedigri);
	}
}
