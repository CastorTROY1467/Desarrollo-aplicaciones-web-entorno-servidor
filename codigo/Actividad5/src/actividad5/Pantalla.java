package actividad5;

public class Pantalla {
	private String resolucion;
	private String pulgadas;
	private String pixeles;
	
	/**
	 * @param resolucion
	 * @param pulgadas
	 * @param pixeles
	 */
	public Pantalla(String resolucion, String pulgadas, String pixeles) {
		this.resolucion = resolucion;
		this.pulgadas = pulgadas;
		this.pixeles = pixeles;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getPixeles() {
		return pixeles;
	}

	public void setPixeles(String pixeles) {
		this.pixeles = pixeles;
	}
	
	public void mostrar() {
		System.out.println("Pantalla");
		System.out.println("----------");
		System.out.println("Resolucion :: " + this.resolucion);
		System.out.println("Pulgadas :: " + this.pulgadas);
		System.out.println("Pixeles :: " + this.pixeles);
		System.out.println();
	}
}
