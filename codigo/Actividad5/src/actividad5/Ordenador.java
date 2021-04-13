package actividad5;

public class Ordenador {
	private Pantalla pantalla;
	private Procesador procesador;
	private DiscoDuro discoDuro;
	private Memoria memoria;
	
	/**
	 * @param pantalla
	 * @param procesador
	 * @param discoDuro
	 * @param memoria
	 */
	public Ordenador(Pantalla pantalla, Procesador procesador, DiscoDuro discoDuro, Memoria memoria) {
		this.pantalla = pantalla;
		this.procesador = procesador;
		this.discoDuro = discoDuro;
		this.memoria = memoria;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public DiscoDuro getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(DiscoDuro discoDuro) {
		this.discoDuro = discoDuro;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}
	
	public void mostrar() {
		System.out.println("Características del ordenador");
		System.out.println("-----------------------------\n");
		pantalla.mostrar();
		procesador.mostrar();
		discoDuro.mostrar();
		memoria.mostrar();
	}
}
