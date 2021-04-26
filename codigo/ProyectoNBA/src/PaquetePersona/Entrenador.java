package PaquetePersona;

public class Entrenador extends Persona {
	private int experiencia;
	private String[] equipos;
	
	/**
	 * @param nombre
	 * @param nacionalidad
	 * @param edad
	 * @param experiencia
	 * @param equipos
	 */
	public Entrenador(String nombre, String nacionalidad, int edad, int experiencia, String[] equipos) {
		super(nombre, nacionalidad, edad);
		this.experiencia = experiencia;
		this.equipos = equipos;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String[] getEquipos() {
		return equipos;
	}

	public void setEquipos(String[] equipos) {
		this.equipos = equipos;
	}

	public void mostrar() {
		super.mostrar();
		System.out.println("Experiencia :: " + this.experiencia + " años");
		System.out.println();
		System.out.println("Equipos");
		
		for (String equipo : equipos) {
			System.out.println("* " + equipo);
		}
	}
}
