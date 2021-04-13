package actividad5;

public class Procesador {
	private String numeroNucleos;
	private String velocidad;
	private String bits;
	
	/**
	 * @param numeroNucleos
	 * @param velocidad
	 * @param bits
	 */
	public Procesador(String numeroNucleos, String velocidad, String bits) {
		this.numeroNucleos = numeroNucleos;
		this.velocidad = velocidad;
		this.bits = bits;
	}

	public String getNumeroNucleos() {
		return numeroNucleos;
	}

	public void setNumeroNucleos(String numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getBits() {
		return bits;
	}

	public void setBits(String bits) {
		this.bits = bits;
	}
	
	public void mostrar() {
		System.out.println("Procesador");
		System.out.println("----------");
		System.out.println("Numero nucleos :: " + this.numeroNucleos);
		System.out.println("Velocidad :: " + this.velocidad);
		System.out.println("Bits :: " + this.bits);
		System.out.println();
	}
}
