package paqueteActivos;

public class Accion extends Activo {
	private static double comision = 0.05;
	
	public Accion(String simbolo, String nombre, double cotizacion, String fechaCompra) {
		super(simbolo, nombre, cotizacion, fechaCompra);
	}
	
	@Override
	public double comprar(int numero) {
		super.setCantidad(numero);
		
		double importe = (numero * super.getCotizacion());
		double comision = Accion.comision * importe;
		
		
		System.out.println("Comprando " + numero + " acciones de " + super.getNombre());
		System.out.println("Importe: " + (importe + comision) + " €");
		System.out.println();
		
		return importe;
	}

	@Override
	public double vender(int numero) {
		super.setCantidad(super.getCantidad() - numero);
		
		double importe = (numero * super.getCotizacion());
		
		System.out.println("Se venderán " + numero + " acciones de " + super.getNombre());
		System.out.println("Recibirá " + importe + " € en su cuenta");
		System.out.println();
		
		return importe;
	}
}
