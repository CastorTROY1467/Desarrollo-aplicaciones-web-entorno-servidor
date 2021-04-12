public class Ejercicio5 {
	public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}

	public static void count(String x) {
		char[] ch = x.toCharArray();

		// Declaramos variables para contar los diferentes caracteres 
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;

		// Recorremos la cadena de caracteres con un bucle for
		for(int i = 0; i < x.length(); i++){

			// Utilizamos los métodos de la clase Character para comprobar el tipo mediante if-elses anidados
			if(Character.isLetter(ch[i])){
				letter++ ;
			}
			else if(Character.isDigit(ch[i])){
				num++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space++ ;
			}
			else{
				other++;
			}
		}

		System.out.println("Cadena original: " + x);
		System.out.println("Letras: " + letter);
		System.out.println("Espacios: " + space);
		System.out.println("Numeros: " + num);
		System.out.println("Otros: " + other);
	}
}