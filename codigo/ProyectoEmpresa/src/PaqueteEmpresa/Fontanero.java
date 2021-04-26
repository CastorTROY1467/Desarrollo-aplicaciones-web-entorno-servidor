package PaqueteEmpresa;

public class Fontanero extends Persona implements ITrabajador{
	private int sueldo;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param sueldo
	 */
	public Fontanero(String nombre, String apellidos, int sueldo) {
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
		System.out.println("Se ha creado un nuevo objeto Fontanero!");
	}

	@Override
	public void trabajar() {
		System.out.println();
		System.out.println("El fontanero " + this.getNombre() + " está trabajando!");
	}

	@Override
	public void pagarSueldo() {
		System.out.println();
		System.out.println("Se ha pagado un sueldo de fontanero a " + this.getNombre() + " " + this.getApellidos() + ". La cantidad asciende a: " + this.sueldo);
	}
}
