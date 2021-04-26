package PaquetePartido;

import PaqueteEquipo.Equipo;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	
	/**
	 * @param nombre
	 * @param local
	 * @param visitante
	 */
	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	
	public void imprimirPrevia() {
		System.out.println(this.local.getNombre() + " vs. " + this.visitante.getNombre());
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		this.local.mostrarEquipo();
		this.visitante.mostrarEquipo();
	}
	
	public void jugarPartido(int puntosLocal, int puntosVisitante) {
		this.local.setPuntos(puntosLocal);
		this.visitante.setPuntos(puntosVisitante);
		System.out.println(obtenerResultado());
		System.out.println(finPartido());
	}
	
	private String obtenerResultado() {
		return "\n******************************************\n" 
				+ this.local.getNombre() + " - " + this.local.getPuntos() + "\n"
				+ this.visitante.getNombre() + " - " + this.visitante.getPuntos() 
				+ "\n******************************************\n"; 
	}
	
	private String finPartido() {
		if (local.getPuntos() > visitante.getPuntos())
			return this.local.getNombre() + " ha ganado el partido!!";
		
		if(local.getPuntos() < visitante.getPuntos())
			return this.visitante.getNombre() + " ha ganado el partido!!";
		
		return "Empate! El partido ira a la prorroga!";
	}
}
