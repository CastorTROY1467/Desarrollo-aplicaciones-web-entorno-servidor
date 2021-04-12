public class Ejercicio2 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			// Comprobamos que el número actual sea impar usando la operación módulo
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}