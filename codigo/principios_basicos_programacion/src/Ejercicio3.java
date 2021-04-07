public class Ejercicio3 {
	
	static final double radio = 7.5; 
	
	public static void main(String[] args) {
		double perimetro = 2 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El perímetro del círculo es: " + perimetro);
		System.out.println("El área del círculo es: " + area);
	}
}