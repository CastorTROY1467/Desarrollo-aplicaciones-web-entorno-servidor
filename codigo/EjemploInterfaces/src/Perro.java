public class Perro implements IAnimal{
	private String raza;
	private int peso;
	private int edad;
	
	/**
	 * @param raza
	 * @param peso
	 * @param edad
	 */
	public Perro(String raza, int peso, int edad) {
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void mover() {
		System.out.println("Un perro " + this.raza + " se mueve!");
	}

	@Override
	public void comer() {
		System.out.println("Un perro come!");
	}
}
