package PaquetePersona;
public class Jugador extends Persona {
	private int estatura;
	private String posicion;
	private boolean capitan;
	
	/**
	 * @param nombre
	 * @param nacionalidad
	 * @param edad
	 * @param estatura
	 * @param posicion
	 * @param capitan
	 */
	public Jugador(String nombre, String nacionalidad, int edad, int estatura, String posicion, boolean capitan) {
		super(nombre, nacionalidad, edad);
		this.estatura = estatura;
		this.posicion = posicion;
		this.capitan = capitan;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isCapitan() {
		return capitan;
	}

	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}

	public void mostrar() {
		if(isCapitan())
			super.setNombre(super.getNombre() + " (C)");
		
		super.mostrar();
		System.out.println("Estatura :: " + this.estatura);
		System.out.println("Posicion :: " + this.posicion);
	}
}