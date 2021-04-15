public class Perro extends Animal{
	
	public Perro(String nombre, String habitat, String reino) {
		super(nombre, habitat, reino);
	}

	@Override
	public void mover() {
		System.out.println("El perro " + this.getNombre() + " se está moviendo!!");
	}

	@Override
	public void comer() {
		System.out.println("El perro " + this.getNombre() +  " está comiendo pienso!!");
	}
	
}
