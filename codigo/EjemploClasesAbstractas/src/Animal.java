/**
 * Utilizamos la palabra abstract para definir la clase y los métodos que 
 * queremos que sean implementados obligatoriamente por las clases que hereden de Animal
 */
public abstract class Animal {
	private String nombre;
	private String habitat;
	private String reino;
	
	abstract public void mover();
	abstract public void comer();
	
	/**
	 * @param nombre
	 * @param habitat
	 * @param reino
	 */
	public Animal(String nombre, String habitat, String reino) {
		this.nombre = nombre;
		this.habitat = habitat;
		this.reino = reino;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getReino() {
		return reino;
	}
	public void setReino(String reino) {
		this.reino = reino;
	}
	
	public void mostrarInfo() {
		System.out.println();
		System.out.println("Nombre :: " + this.nombre);
		System.out.println("Habitat :: " + this.habitat);
		System.out.println("Reino :: " + this.reino);
		System.out.println();
	}
}
