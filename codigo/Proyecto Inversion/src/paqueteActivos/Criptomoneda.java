package paqueteActivos;

public class Criptomoneda extends Activo {
	private static double comision = 0.1;
	
	public Criptomoneda(String simbolo, String nombre, double cotizacion, String fechaCompra) {
		super(simbolo, nombre, cotizacion, fechaCompra);
	}

	@Override
	public double comprar(int numero) {
		super.setCantidad(numero);
		
		double importe = (numero * super.getCotizacion());
		double comision = Criptomoneda.comision * importe;
		
		
		System.out.println("Comprando " + numero + " " + super.getSimbolo());
		System.out.println("Importe: " + (importe + comision) + " €");
		System.out.println();
		
		return importe;
	}

	@Override
	public double vender(int numero) {
		super.setCantidad(super.getCantidad() - numero);
		
		double importe = (numero * super.getCotizacion());
		
		System.out.println("Se venderán " + numero + " " + super.getSimbolo());
		System.out.println("Recibirá " + importe + " € en su cuenta");
		System.out.println();
		
		return importe;
	}
}
