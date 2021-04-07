public class Ejercicio5 {
	
	public static void main(String[] args) {
		final int numero = 352;
		
		System.out.println("El número recibido es: " + numero);
		System.out.println("La suma de sus dígitos es: " + sumarDigitos(numero));
	}
	
	static int sumarDigitos(int n) {
		int sum = 0;
		
		while (n != 0) {
			// Cuándo hacemos n % 10, siempre obtenemos el primer dígito decimal
			// 352 / 10 = 35'2 => Resto = 2
			
			// sum = sum + (n % 10)
			sum += n % 10;
			
			// n = n / 10;
			n /= 10;
		}
		
		
		return sum;
	}
}