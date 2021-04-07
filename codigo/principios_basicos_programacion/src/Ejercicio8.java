
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero: ");
		double num1 = input.nextInt(); 
				
		System.out.println("Introduzca el segundo numero: ");
		double num2 = input.nextInt();
		
		double sum = suma(num1, num2);
		double res = resta(num1, num2);
		double mul = multiplicacion(num1, num2);
		double div = division(num1, num2);
		
		System.out.println("Suma: " + sum);
		System.out.println("Resta: " + res);
		System.out.println("Multiplicación: " + mul);
		System.out.println("División: " + div);
	}
	
	static double suma(double x, double y) {
		return x + y;
	}
	
	static double resta(double x, double y) {
		return x - y;
	}
	
	static double multiplicacion(double x, double y) {
		return x * y;
	}
	
	static double division(double x, double y) {
		return x / y;
	}
}
