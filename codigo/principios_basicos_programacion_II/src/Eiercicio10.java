import java.util.Arrays;

public class Eiercicio10 {
	public static void main(String[] args) {
		int[] nums = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
		int[] nums3 = {0, -1, -5, -3, -6 , -8, 1, 5, 7, 9, 9 ,0};
		
		System.out.println("Array original: " + Arrays.toString(nums3));
		
		int[] result = ordenarArray(nums3);
		System.out.println("\nResultado: " + Arrays.toString(result));
	}
	
	public static int[] ordenarArray(int[] nums) {
		// Declaramos una variable de control; Nos permitirá salir del bucle cuando ya esté ordenado.
		boolean flag = true;
		
		while (flag) {
			flag = false;
			
			/**
			 * Recorremos el array de enteros hasta la penúltima posición.
			 * 
			 * Vamos a comparar el elemento actual con el siguiente, si lo recorriesemos hasta la última nos daría un error al intentar acceder a nums[i + 1]
			 */
			for (int i = 0; i < nums.length - 1; i++) {
				
				// Si el elemento actual es mayor que el siguiente, intercambiamos y ponemos el mayor a la derecha
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
					
					/**
					 * Cuando necesite hacer un intercambio volvemos a poner el flag a true para reevaluar todo el array.
					 * 
					 * En caso de no tener que hacer ningún intercambio (cuando el array ya esté ordenado) flag será false y se saldrá del while, devolviendo el array ordenado.
					 */
					flag = true;
				}
			}
		}
		return nums;
	}
	
	private static void swap(int[] nums, int left, int right) {
		int temp = nums[right];
		nums[right] = nums[left];
		nums[left] = temp;
	}
}