import java.util.Scanner;

public class Main {
	// Variables encargadas de almacenar los numeros con los que operar
	static double num1, num2 = 0;
	
	// Variable que almacenara el resultado de la operacion
	static double result;
	
	public static void main(String[] args) {
		calculadora();
	}
	
	/**
	 * Calculadora 1.0
	 */
	static void calculadora() {
		// Inicializamos a 1 para que pueda entrar en el while
		int option = 1;
		
		/**
		 * Ejecutaremos la logica de la calculadora mientras option sea distinto de 5.
		 * De este modo, al introducir la opcion 5, se parará la ejecucion del programa 
		 */
		while(option != 5) {
			mostrarMenu();
			
			// Casteamos el double devuelto por entradaUser a int para poder utilizarlo en el switch
			option = (int) entradaUser("Introduzca una opcion");
			
			/**
			 * EJEMPLO DE LÓGICA DEMASIADO COMPLICADA
			 * Para que funcione: comentar el default y descomentar el if
			 * Si option es igual 0 se imprime un mensaje de error.
			 * Del mismo modo, si option es mayor que 5 se imprime el mismo mensaje.
			 * Mediante este if controlamos que, si el usuario introduce valores fuera del rango de opciones, no obtengamos 
			 * comportamientos inesperados de la aplicacion.
			 */
//			if (option != 0 && option <= 5) {
				System.out.println();
				
				switch (option) {
				case 1:
					System.out.println("Ha elegido SUMA");
					obtenerNumeros();
					result = sum(num1, num2);
					mostrarResultado();
					break;
				case 2:
					System.out.println("Ha elegido RESTA");
					obtenerNumeros();
					result = rest(num1, num2);
					mostrarResultado();
					break;
				case 3:
					System.out.println("Ha elegido MULTIPLICACION");
					obtenerNumeros();
					result = mult(num1, num2);
					mostrarResultado();
					break;
				case 4:
					System.out.println("Ha elegido DIVISION");
					obtenerNumeros();
					result = div(num1, num2);
					mostrarResultado();
					break;
				case 5:
					System.out.println();
					System.out.println("Ha elegido salir de la aplicacion...");
					System.out.println();
					System.out.println("Hasta pronto!");
					System.out.println();
					break;
				default:
					System.out.println();
					System.out.println("Opcion incorrecta...");
				}
//			} else {
//				System.out.println();
//				System.out.println("Opcion incorrecta...");
//			}
		}
	}
	
	/**
	 * Imprime por pantalla el menu de la calculadora
	 */
	static void mostrarMenu() {
		System.out.println();
		System.out.println("Calculadora Basica 1.0");
		System.out.println("Elija una opcion: ");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		System.out.println();
	}
	
	/**
	 * Muestra un mensaje personalizado y recoge un valor de tipo double introducido por el usuario
	 * @param texto 	Mensaje a imprimir para que el usuario introduzca un número
	 * @return num		Numero introducido por el usuario
	 */
	static double entradaUser(String texto) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println(texto);
		System.out.println();
		
		double num = sc.nextDouble();
		
		return num;
	}
	
	/**
	 * Imprime un mensaje con el resultado de la operacion elegida por el usuario
	 */
	static void mostrarResultado() {
		System.out.println();
		System.out.println("El resultado de la operacion es: " + result);
		System.out.println();
	}
	
	/**
	 * Utilizando el metodo entradaUser cambia el valor de las variables num1 y num2
	 */
	static void obtenerNumeros() {
		num1 = entradaUser("Introduzca el primer numero: ");
		num2 = entradaUser("Introduzca el segundo numero: ");
	}
	
	/**
	 * @param x		Primer numero con el que realizar la operacion suma
	 * @param y		Segundo numero con el que realizar la operacion suma
	 * @return		Suma de ambos numeros
	 */
	static double sum(double x, double y) {
		return x + y;
	}
	
	/**
	 * @param x		Primer numero con el que realizar la operacion resta
	 * @param y		Segundo numero con el que realizar la operacion resta
	 * @return		Resta de ambos numeros
	 */
	static double rest(double x, double y) {
		return x - y;
	}
	
	/**
	 * @param x		Primer numero con el que realizar la operacion multiplicacion
	 * @param y		Segundo numero con el que realizar la operacion multiplicacion
	 * @return		Multiplicacion de ambos numeros
	 */
	static double mult(double x, double y) {
		return x * y;
	}
	
	/**
	 * @param x		Primer numero con el que realizar la operacion division
	 * @param y		Segundo numero con el que realizar la operacion division
	 * @return		Division de ambos numeros
	 */
	static double div(double x, double y) {
		return x / y;
	}
}