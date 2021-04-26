package PaqueteEmpresa;

public class Pintor extends Persona implements ITrabajador{
	private int sueldo;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param sueldo
	 */
	public Pintor(String nombre, String apellidos, int sueldo) {
		super(nombre, apellidos);
		this.sueldo = sueldo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Sueldo :: " + this.sueldo);
	}

	@Override
	public void mostrarAlta() {
		System.out.println("Se ha creado un nuevo objeto Pintor!");
	}

	@Override
	public void trabajar() {
		System.out.println();
		System.out.println("El pintor " + this.getNombre() + " está trabajando!");
	}

	@Override
	public void pagarSueldo() {
		System.out.println();
		System.out.println("Se ha pagado un sueldo de pintor a " + this.getNombre() + " " + this.getApellidos() + ". La cantidad asciende a: " + this.sueldo);
	}
}
