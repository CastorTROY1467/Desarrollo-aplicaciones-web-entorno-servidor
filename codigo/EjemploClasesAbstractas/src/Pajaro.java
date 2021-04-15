
public class Pajaro extends Animal{

	public Pajaro(String nombre, String habitat, String reino) {
		super(nombre, habitat, reino);
	}

	@Override
	public void mover() {
		System.out.println("El pájaro " + this.getNombre() +  " está volando!!");
	}

	@Override
	public void comer() {
		System.out.println("El pájaro " + this.getNombre() + " está comiendo semillas!!");
	}
}
