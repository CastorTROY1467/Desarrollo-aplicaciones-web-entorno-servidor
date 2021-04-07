
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = input.next();
		
		System.out.println("Introduce tu apellido: ");
		String apellido = input.next();
		
		System.out.println("Hola");
		System.out.println();
		System.out.println(nombre + " " + apellido + "!");
	}
}
