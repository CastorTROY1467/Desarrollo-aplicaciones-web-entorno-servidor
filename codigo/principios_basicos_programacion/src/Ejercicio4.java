public class Ejercicio4 {
	
	// static: para poder utilizar la variable al definirla fuera del main
	// final: evita que su valor se puede modificar (básicamente la convertimos en constante)
	static final double radio = 7.5; 
	
	public static void main(String[] args) {
		System.out.println("El perímetro del círculo es: " + calcularPerimetro(radio));
		System.out.println("El área del círculo es: " + calcularArea(radio));
	}
	
	static double calcularPerimetro(double radio) {
//		double perimetro = 2 * Math.PI * radio;
//		return perimetro;
		return 2 * Math.PI * radio;
	}
	
	static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
}