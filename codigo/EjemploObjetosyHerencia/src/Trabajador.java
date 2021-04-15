
public class Trabajador extends Persona{
	private String lugarTrabajo;
	private String numSS;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param lugarTrabajo
	 * @param numSS
	 */
	public Trabajador(String nombre, String apellido, String lugarTrabajo, String numSS) {
		super(nombre, apellido);
		this.lugarTrabajo = lugarTrabajo;
		this.numSS = numSS;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getNumSS() {
		return numSS;
	}

	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Trabajador");
		System.out.println("----------");
		System.out.println("Nombre :: " + this.getNombre());
		System.out.println("Apellidos :: " + this.getApellido());
		System.out.println("Lugar Trabajo:: " + this.lugarTrabajo);
		System.out.println("Numero Seguridad Social:: " + this.numSS);
	}
}
