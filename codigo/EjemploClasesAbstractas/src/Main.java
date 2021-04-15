
public class Main {
	public static void main(String[] args) {
		Perro perro = new Perro("Toby", "Ciudad", "Animal");
		Pajaro pajaro = new Pajaro("Munin", "Campo", "Animal");
		
		System.out.println("Animales");
		System.out.println("--------------------------------");
		
		perro.mostrarInfo();
		perro.mover();
		perro.comer();
		
		System.out.println("\n--------------------------------");
		
		pajaro.mostrarInfo();
		pajaro.mover();
		pajaro.comer();
	}
}
