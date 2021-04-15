package persistencia_objetos;

import java.io.Serializable;

public class Coche implements Serializable{
	// Necesario para poder implementar la clase Serializable
	private static final long serialVersionUID = 1L;
	
	private String modelo;
	private String matricula;
	private String motor;
	
	/**
	 * @param modelo
	 * @param matricula
	 * @param motor
	 */
	public Coche(String modelo, String matricula, String motor) {
		this.modelo = modelo;
		this.matricula = matricula;
		this.motor = motor;
	}
	
	public void mostrar() {
		System.out.println();
		System.out.println("Modelo :: " + this.modelo);
		System.out.println("Matricula :: " + this.matricula);
		System.out.println("Motor :: " + this.motor);
	}
}
