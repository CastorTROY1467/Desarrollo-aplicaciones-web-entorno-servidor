package actividad5;

public class Main {
	public static void main(String[] args) {
		Pantalla pantalla = new Pantalla("21\"", "1920x1080", "1920 px");
		Procesador procesador = new Procesador("8", "3.1 GHz", "64x");
		DiscoDuro discoDuro = new DiscoDuro("5400 rpm", "1 TB", "5,55 s");
		Memoria memoria = new Memoria("16 GB", "DDR4", "2666 MHz");
		
		Ordenador ordenador = new Ordenador(pantalla, procesador, discoDuro, memoria);
		
		ordenador.mostrar();
	}
}
