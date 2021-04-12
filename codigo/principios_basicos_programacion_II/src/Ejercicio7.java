import java.util.*;

public class Ejercicio7 {
	public static void main(String[] args) {
		/**
		 * Integer es una clase que amplia la funcionalidad del tipo primitivo int.
		 * En este ejemplo podriamos utilizar un array de ints, pero si intentasemos ordenar el array en orden descendente nos daria un error en Arrays.sort
		 */
		Integer[] arr = {1, 4, 17, 7, 25, 3, 100}; 

		int k = 3;

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("k: " + k);

		// Ordenamos el array en orden ascendente utilizando el metodo sort de la clase Arrays
		Arrays.sort(arr);

		// Recorremos el array imprimiendo sus elementos hasta llegar a k
		if(k < arr.length) {
			System.out.print("\n" + k + " elementos mas pequeños del array son: ");
			for(int i = 0; i < k; i++)
				System.out.print(arr[i] + " ");
		} else {
			System.out.println("\nERROR");
			System.out.println("\nEl número introducido es mayor que la longitud del array");
		}
	}
}