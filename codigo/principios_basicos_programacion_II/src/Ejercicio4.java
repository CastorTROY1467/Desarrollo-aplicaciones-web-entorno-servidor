public class Ejercicio4 {
	public static void main(String[] args) {
		String str = "xyyz";
		System.out.println("Cadena original: " + str);
		System.out.println("Todos los caracteres de la cadena son únicos: " + esCadenaUnica(str));
	}
	
	/**
     * @param String str		Cadena de caracteres que queremos evaluar
     * @return boolean			Verdadero si el array contiene valores únicos, falso si existe algún caracter repetido
     */
	public static boolean esCadenaUnica(String str) {
		// Convertimos la cadena que se recibe como parametro a un array de caracteres
        char[] chars = str.toCharArray();
        
        /**
         * Recorreremos el array dos veces, seleccionando cada elemento y comparándolo con el resto.
         */
        for (int i = 0; i < chars.length; i++) {
        	for(int j = i + 1; j < chars.length; j++)
        		if (chars[i] == chars[j])
        			return false;
        }
        
        return true;
    }
}