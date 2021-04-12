import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] num_array = {50, -20, 0, 30, 40, 60, 10};

		// Arrays.toString nos permite imprimir un array como una cadena de caracteres
		System.out.println("Array: " + Arrays.toString(num_array));

		// Si la longitud del array es >= 0 y el primer elemento es igual al último.
		System.out.println (num_array.length >= 2 && num_array[0] ==  num_array[num_array.length - 1]);
	}
}