public class Ejercicio3 {
	public static void main(String[] args) {
		// Creamos el bucle del 1 al 100 (utilizamos <= para incluir el numero 100 en el rango)
		for (int i = 1; i <= 100; i++) {
			// Comprobamos con if-else las condiciones del enunciado utilizando la operación módulo 
			// (si es divisible entre 3 :: i % 3 == 0)
			if (i % 3 == 0 && i % 5 == 0) {	
				System.out.println(i + ": fizz buzz");
			} else if (i % 5 == 0) {
				System.out.println(i + ": buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + ": fizz");
			} 
		}

		System.out.printf("\n");
	}
}