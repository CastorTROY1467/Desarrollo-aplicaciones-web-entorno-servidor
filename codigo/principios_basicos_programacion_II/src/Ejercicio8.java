import java.util.*;

public class Ejercicio8 {
	public static void main(String[] args) {
		Integer[] arr = {1, 4, 17, 7, 25, 3, 100, 400}; 

		int k = 4;

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("k: " + k);

		/**
		 * Ordenamos el array en orden descendente, para ello utilizamos Collections.reverseOrder.
		 * 
		 * Esta es la razon por la que utilizamos un array de Integer en vez del tipo primitivo int.
		 * Collections.reverseOrder no tiene soporte para tipos primitivos porque utiliza la clase Comparator que solo trabaja con objetos.
		 */
		Arrays.sort(arr, Collections.reverseOrder());

		// Recorremos el array imprimiendo sus elementos hasta llegar a k
		if(k < arr.length) {
			System.out.print("\n" + k + " elementos mas grandes del array son: ");
			for(int i = 0; i < k; i++)
				System.out.print(arr[i] + " ");
		} else {
			System.out.println("\nERROR");
			System.out.println("\nEl número introducido es mayor que la longitud del array");
		}
	}
}