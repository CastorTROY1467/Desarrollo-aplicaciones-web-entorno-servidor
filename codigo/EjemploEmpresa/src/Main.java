
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jose Angel", "Fernandez Garcia", "jafernandez@gmail.com", "03-12-2020", 125.1);
		Cliente cliente2 = new Cliente("Juan", "Gonzalez Campos", "juangonzalezcampos@gmail.com", "15-02-2021", 200.0);
		Cliente cliente3 = new Cliente("Javier", "Cortes Lopez", "corteslopez@gmail.com", "30-11-2020", 560.95);
		Cliente cliente4 = new Cliente("Peter", "Smith", "petesmith@gmail.com", "26-05-2020", 50.0);
		Cliente cliente5 = new Cliente("Francisco", "Gomez Santos", "fgsantos@gmail.com", "10-03-2021", 1000.50);
		
		Empresa empresa = new Empresa("Empresa Falsa S.L.");
		
		empresa.agregar(cliente1);
		empresa.agregar(cliente2);
		empresa.agregar(cliente3);
		empresa.agregar(cliente4);
		empresa.agregar(cliente5);
		
		empresa.mostrarClientes();
		empresa.imprimirGanancias();
	}

}
