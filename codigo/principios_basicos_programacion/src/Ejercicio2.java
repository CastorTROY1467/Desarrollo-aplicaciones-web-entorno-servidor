public class Ejercicio2 {
	public static void main(String[] args) {
		float num1 = 5.25f;
		float num2 = 2;
		
		System.out.println("Suma: " + suma(num1, num2));
		System.out.println("Resta: " + resta(num1, num2));
		System.out.println("Multiplicación: " + multiplicacion(num1, num2));
		System.out.println("División: " + division(num1, num2));
	}
	
	static float suma(float x, float y) {
		return x + y;
	}
	
	static float resta(float x, float y) {
		return x - y;
	}
	
	static float multiplicacion(float x, float y) {
		return x * y;
	}
	
	static float division(float x, float y) {
		return x / y;
	}
}