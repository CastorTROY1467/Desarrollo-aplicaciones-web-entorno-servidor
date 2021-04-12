import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		String[] arr = {"gato", "perro", "rojo", "es", "somos"};
		
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Palabra(s) mas larga(s): " + palabrasMasLargas(arr));
	}

	/**
	 * El tipo de dato ArrayList<String> nos permite trabajar con Arrays redimensionables, lo que nos permitirá añadir o eliminar
	 * elementos del array mediante los métodos de su interfaz.
	 */
	static ArrayList<String> palabrasMasLargas(String[] arr) {
		// Creamos una variable ArrayList que contendrá los resultados
		ArrayList<String> list = new ArrayList<String>();

		// Declaramos una variable auxiliar para obtener la maxima longitud de los elementos del diccionario
		int max_longitud = 0;

		// Sintaxis alternativa para recorrer arrays; La utilizamos porque no necesitamos el indice de los elementos
		for(String str : arr) {
			// Método length para cadenas de caracteres
			int longitud = str.length();
			
			/**
			 * Si la longitud del elemento actual es mayor que max_longitud, guardamos la nueva longitud maxima y borramos la lista (lo que tuviesemos en ella ya no vale)
			 */
			if (longitud > max_longitud) {
				max_longitud = longitud;
				list.clear();
			}
			
			// Si la longitud del elemento actual coincide con la longitud maxima, añadimos el elemento a la lista
			if (longitud == max_longitud) {
				list.add(str);
			}
		}

		return list;
	}
}