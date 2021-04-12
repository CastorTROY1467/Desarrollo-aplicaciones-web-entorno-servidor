import java.util.*;

public class Ejercicio9 {
	public static void main(String[] args) {
		Integer nums[] = {1, 4, 17, 7, 25, 3, 100};

		double sum = 0;

		System.out.println("Array: " + Arrays.toString(nums));

		// Recorremos el array al completo y vamos calculando la suma de sus elementos
		for(int i = 0; i < nums.length; i++) {      
			sum += nums[i];
		}

		double media = sum / nums.length;

		System.out.println("La media de los elementos es: " + media);
		System.out.printf("\nLos elementos del array mayores que la media son: ");

		// Recorremos el array de nuevo para comparar los elementos con el valor de media obtenido
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > media) {
				System.out.print(nums[i] + " ");
			}
		}
	}
}