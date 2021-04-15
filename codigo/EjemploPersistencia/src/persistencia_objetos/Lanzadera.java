package persistencia_objetos;

import java.io.*;

public class Lanzadera {
	public static void main(String[] args) {
		// Intanciamos la clase coche con tres parámetros
		Coche coche = new Coche("Seat Leon", "xxx-XXX", "1.4 Gasolina");
		
		try {
			// Flujo de escritura sobre el fichero "coche.ser"
			FileOutputStream fileOut = new FileOutputStream("coche.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			// Se escribe el objeto
			out.writeObject(coche);
			
			// Se cierra el flujo de escritura y el fichero
			out.close();
			fileOut.close();
			System.out.println("Objeto serializado en \"coche.ser\"");
		} catch(IOException ioException1) {
			ioException1.printStackTrace();
		}
		
		try {
			 // Flujo de lectura sobre el fichero
			FileInputStream fileIn = new FileInputStream("coche.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			// Se lee el objeto del archivo y lo convertimos en un objeto Coche
			Coche cocheLeido = (Coche) in.readObject();
			
			// Cerramos el flujo de lectura de datos
			in.close();
			fileIn.close();
			
			// Mostramos la información del objeto extraido
			cocheLeido.mostrar();
		} catch (IOException ioException2) {
			ioException2.printStackTrace();
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		}
	}
}