public class Mascota extends Perro {
	private String nombre;

	/**
	 * @param raza
	 * @param nombre
	 */
	public Mascota(String raza, String nombre) {
		super(raza);
		this.nombre = nombre;
	}
	
	public void alimentar() {
		System.out.println("La mascota " + this.nombre + " de raza " + this.getRaza() + " está comiendo!");
	}
}
