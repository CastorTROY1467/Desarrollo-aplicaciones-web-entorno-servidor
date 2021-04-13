package actividad5;

public class Memoria {
	private String tamaño;
	private String tecnologia;
	private String velocidad;
	
	/**
	 * @param tamaño
	 * @param tecnologia
	 * @param velocidad
	 */
	public Memoria(String tamaño, String tecnologia, String velocidad) {
		this.tamaño = tamaño;
		this.tecnologia = tecnologia;
		this.velocidad = velocidad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	
	public void mostrar() {
		System.out.println("Memoria");
		System.out.println("----------");
		System.out.println("Tamaño :: " + this.tamaño);
		System.out.println("Tecnologia :: " + this.tecnologia);
		System.out.println("Pixeles :: " + this.velocidad);
		System.out.println();
	}
}
