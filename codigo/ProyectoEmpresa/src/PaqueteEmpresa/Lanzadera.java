package PaqueteEmpresa;

public class Lanzadera {

	public static void main(String[] args) {
		Fontanero fontanero = new Fontanero("Fernando", "Jimenez Gonzalez", 16000);
		Fontanero fontanero2 = new Fontanero("Pedro", "Paramo Segura", 16000);
		Pintor pintor = new Pintor("Laura", "Rodriguez Garcia", 20000);
		Cliente cliente = new Cliente("Jesús", "Riaño Perez", "Calle Falsa, 3");
		
		Empresa empresa = new Empresa();
		
		empresa.agregarFontanero(fontanero);
		empresa.agregarFontanero(fontanero2);
		
		empresa.agregarPintor(pintor);
		
		empresa.agregarCliente(cliente);
		
		empresa.mostrarFontaneros();
		empresa.mostrarPintores();
		empresa.mostrarClientes();
		
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		fontanero.trabajar();
		pintor.trabajar();
		
		fontanero.pagarSueldo();
		pintor.pagarSueldo();
	}
}
