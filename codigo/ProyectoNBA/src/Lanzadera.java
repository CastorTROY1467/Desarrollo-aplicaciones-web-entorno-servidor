import java.util.ArrayList;
import java.util.Arrays;

import PaqueteEquipo.Equipo;
import PaquetePartido.Partido;
import PaquetePersona.Entrenador;
import PaquetePersona.Jugador;

public class Lanzadera {
	public static void main(String[] args) {
		Entrenador entrenadorGSW = new Entrenador("Steve Kerr", "US", 55, 7, new String[]{"Golden State Warriors"});
		Entrenador entrenadorCLE = new Entrenador("Tyronn Lue", "US", 43, 12, new String[]{"Boston Celtics", "Los Angeles Clippers", "Cleveland Cavaliers"});
		
		// Jugadores de Golden State Warriors
		Jugador GSW_B = new Jugador("Stephen Curry", "US", 28, 191, "Base", true);
		Jugador GSW_E = new Jugador("Klay Thompson", "US", 26, 196, "Escolta", true);
		Jugador GSW_A = new Jugador("Harrison Barnes", "US", 23, 203, "Alero", false);
		Jugador GSW_AP = new Jugador("Draymond Green", "US", 26, 198, "Ala-Pivot", true);
		Jugador GSW_P = new Jugador("Andrew Bogut", "AUS", 31, 213, "Pivot", false);
		
		// Jugadores de Cleveland Cavaliers
		Jugador CLE_B = new Jugador("Kyrie Irving", "US", 23, 188, "Base", true);
		Jugador CLE_E = new Jugador("J.R. Smith", "US", 30, 198, "Escolta", false);
		Jugador CLE_A = new Jugador("LeBron James", "US", 31, 206, "Alero", true);
		Jugador CLE_AP = new Jugador("Kevin Love", "US", 28, 203, "Ala-Pivot", true);
		Jugador CLE_P = new Jugador("Tristan Thompson", "CAN", 25, 206, "Pivot", false);
		
		
		/**
		 * Inicializamos los dos equipos, voy a utilizar cada uno de los constructores de la clase Equipo para ilustrar como funcionaria cada uno de ellos
		 */
		Equipo local = new Equipo("Golden State Warriors", entrenadorGSW);
		
		// Utilizamos el método "agregarJugador" para llenar el array de Jugadores con los correspondientes a Golden State
		local.agregarJugador(GSW_B);
		local.agregarJugador(GSW_E);
		local.agregarJugador(GSW_A);
		local.agregarJugador(GSW_AP);
		local.agregarJugador(GSW_P);
		
		// En este caso creamos un nuevo ArrayList que cargamos con los jugadores de Cleveland directamente en el constructor
		Equipo visitante = new Equipo("Cleveland Cavaliers", new ArrayList<Jugador>(Arrays.asList(CLE_B, CLE_E, CLE_A, CLE_AP, CLE_P)), entrenadorCLE);
		
		// Creamos un objeto partido, con el que ejecutaremos la funcionalidad de la aplicación
		Partido partido = new Partido(local, visitante);
		partido.imprimirPrevia();
		partido.jugarPartido(120, 115);
	}
}
