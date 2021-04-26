package PaqueteEquipo;

import java.util.ArrayList;
import PaquetePersona.*;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private Entrenador entrenador;
	private int puntos;
	
	/**
	 * Utilizaremos este constructor si queremos inicializar el atributo "jugadores" como un array vacío y añadir jugadores mediante el método "agregarJugadores"
	 * @param nombre
	 * @param jugadores
	 * @param entrenador
	 */
	public Equipo(String nombre, Entrenador entrenador) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<Jugador>();
		this.entrenador = entrenador;
		this.puntos = 0;
	}

	/**
	 * Utilizaremos este constructor si queremos crear un array con los jugadores en la clase "Lanzadera" y pasarselo como parametro a la hora de crear un Equipo
	 * @param nombre
	 * @param jugadores
	 * @param entrenador
	 */
	public Equipo(String nombre, ArrayList<Jugador> jugadores, Entrenador entrenador) {
		this.nombre = nombre;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
		this.puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void agregarJugador(Jugador j) {
		this.jugadores.add(j);
	}

	public void mostrarEquipo() {
		System.out.println("----------------------------------");
		System.out.println(this.nombre);
		System.out.println("----------------------------------\n");
		
		System.out.println("Entrenador");
		System.out.println("----------");
		this.entrenador.mostrar();
		
		System.out.println("\nTitulares");
		System.out.println("---------");
		
		for (Jugador jugador : this.jugadores) {
			jugador.mostrar();
			System.out.println();
		}
	}
}
