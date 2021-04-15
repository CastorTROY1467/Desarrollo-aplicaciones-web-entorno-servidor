
public class Main {
	public static void main(String[] args) {
		/**
		 * Creación de objetos y asignacion de valores a traves del constructor.
		 */
		Persona persona1 = new Persona("Antonio", "GC", "03-12-1995", "11111111S", 25, "Hombre");
		Persona persona2 = new Persona("Rafael Luis", "GLP", "15-06-1964", "22222222F", 57, "Hombre");
		Persona persona3 = new Persona("Isabel", "CPP", "20-01-1960", "33333333V", 61, "Mujer");
		Persona persona4 = new Persona("Jaime", "GC");
		
		System.out.println("Nombre de persona 1 :: " + persona1.getNombre() + " " + persona1.getApellido());
		System.out.println("Nombre de persona 2 :: " + persona2.getNombre() + " " + persona2.getApellido());
		System.out.println("Nombre de persona 3 :: " + persona3.getNombre() + " " + persona3.getApellido());
		System.out.println("Nombre de persona 4 :: " + persona4.getNombre() + " " + persona4.getApellido());
		
		System.out.println("\nMiembros de la Familia");
		System.out.println("--------------------------------------------");
		
		/**
		 * Declaramos un nuevo objeto familia y añadimos nuestros objetos persona mediante el método agregar.
		 */
		Familia familia = new Familia();
		familia.agregar(persona1);
		familia.agregar(persona2);
		familia.agregar(persona3);
		familia.agregar(persona4);
		
		familia.mostrarMiembros();
		
		
		Trabajador trabajador = new Trabajador("Felipe", "BG", "Madrid, España", "123456789");
		trabajador.mostrar();
	}
}
