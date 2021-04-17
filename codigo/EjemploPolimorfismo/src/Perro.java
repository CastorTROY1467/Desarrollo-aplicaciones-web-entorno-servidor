public class Perro {
	private String raza;
	
	/**
	 * @param raza
	 */
	public Perro(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void alimentar() {
		System.out.println("Un perro " + this.raza + " está comiendo!");
	}
}
