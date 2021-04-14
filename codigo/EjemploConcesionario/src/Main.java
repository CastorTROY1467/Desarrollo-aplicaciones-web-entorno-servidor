
public class Main {

	public static void main(String[] args) {
		Coche peugeot = new Coche("Peugeot", "5008 GT", "BlueHDi 180cv, Diesel", 60000.00, false);
		Coche ford = new Coche("Ford", "Mustang GT", "5.0 Ti-VCT V8 450cv 6 velocidades. Manual", 57128.00, true);
		Coche tesla = new Coche("Tesla", "Model S", "Electrico, Autonomía 663 km", 149990.00, false);
		Coche porsche = new Coche("Porsche", "Panamera Turbo S E-Hybrid", "515kW/700CV", 197723.00, true);
		
		Venta venta1 = new Venta("0001", "03-04-2021", "11111111-S", porsche);
		Venta venta2 = new Venta("0002", "05-04-2021", "22222222-B", ford);
		
		Concesionario concesionario = new Concesionario("Concesionario Falso");
		
		concesionario.agregarCoche(peugeot);
		concesionario.agregarCoche(ford);
		concesionario.agregarCoche(tesla);
		concesionario.agregarCoche(porsche);
		
		concesionario.agregarVenta(venta1);
		concesionario.agregarVenta(venta2);
		
		concesionario.mostrarCoches();
		concesionario.mostrarVentas();
	}

}
