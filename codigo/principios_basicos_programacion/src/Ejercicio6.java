
public class Ejercicio6 {
	public static void main(String[] args) {
		int a = 15, b = 27, temp;
		
		System.out.println("Antes del intercambio: a, b = " + a + ", " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Después del intercambio: a, b = " + a + ", " + b);
	}
}
