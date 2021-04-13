package actividad5;

public class DiscoDuro {
	private String velocidad;
	private String capacidad;
	private String tiempoMedioAcceso;
	
	/**
	 * @param velocidad
	 * @param capacidad
	 * @param tiempoMedioAcceso
	 */
	public DiscoDuro(String velocidad, String capacidad, String tiempoMedioAcceso) {
		this.velocidad = velocidad;
		this.capacidad = capacidad;
		this.tiempoMedioAcceso = tiempoMedioAcceso;
	}
	
	public String getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getTiempoMedioAcceso() {
		return tiempoMedioAcceso;
	}
	public void setTiempoMedioAcceso(String tiempoMedioAcceso) {
		this.tiempoMedioAcceso = tiempoMedioAcceso;
	}
	
	public void mostrar() {
		System.out.println("Disco Duro");
		System.out.println("----------");
		System.out.println("Velocidad :: " + this.velocidad);
		System.out.println("Capacidad :: " + this.capacidad);
		System.out.println("Tiempo medio de acceso :: " + this.tiempoMedioAcceso);
		System.out.println();
	}
}
