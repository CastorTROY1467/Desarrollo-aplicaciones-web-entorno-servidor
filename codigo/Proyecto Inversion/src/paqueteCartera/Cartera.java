package paqueteCartera;

import java.util.ArrayList;

import paqueteActivos.Accion;
import paqueteActivos.Criptomoneda;
import paqueteUsuario.Usuario;

public class Cartera {
	private Usuario usuario;
	private ArrayList<Accion> acciones;
	private ArrayList<Criptomoneda> criptomonedas;
	private double valor;
	
	/**
	 * @param usuario
	 * @param acciones
	 * @param criptomonedas
	 * @param valor
	 */
	public Cartera(Usuario usuario) {
		this.usuario = usuario;
		this.acciones = new ArrayList<Accion>();
		this.criptomonedas = new ArrayList<Criptomoneda>();
		this.valor = 0;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public ArrayList<Criptomoneda> getCriptomonedas() {
		return criptomonedas;
	}

	public void setCriptomonedas(ArrayList<Criptomoneda> criptomonedas) {
		this.criptomonedas = criptomonedas;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void agregarAccion(Accion a, int numero) {
		this.valor += a.comprar(numero);
		this.acciones.add(a);
	}
	
	public void agregarCripto(Criptomoneda c, int numero) {
		this.valor += c.comprar(numero);
		this.criptomonedas.add(c);
	}
	
	public void eliminarAccion(Accion a, int numero) {
		this.valor -= a.vender(numero);
		if (a.getCantidad() == 0) {
			this.acciones.remove(a);
		}
	}
	
	public void eliminarCripto(Criptomoneda c, int numero) {
		this.valor -= c.vender(numero);
		if (c.getCantidad() == 0) {
			this.criptomonedas.remove(c);
		}
	}
	
	public void mostrarPortfolio() {
		System.out.println("Portfolio - " + this.usuario.getNombre());
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		mostrarAcciones();
		mostrarCripto();
		
		System.out.println("********************************************************");
		System.out.println("Valor total: " + this.valor + " €");
		System.out.println("********************************************************");
		System.out.println();
	}
	
	private void mostrarAcciones() {
		double valor = 0;
		
		for (Accion accion : this.acciones) {
			valor += (accion.getCantidad() * accion.getCotizacion());
			accion.mostrarInformacion();
		}
		
		if(valor != 0) {
			System.out.println("Valor: " + valor + " €");
			System.out.println();
		}
	}
	
	private void mostrarCripto() {
		double valor = 0;

		for (Criptomoneda cripto : this.criptomonedas) {
			valor += (cripto.getCantidad() * cripto.getCotizacion());
			cripto.mostrarInformacion();
		}
		
		if(valor != 0 ) {
			System.out.println("Valor: " + valor + " €");
			System.out.println();
		}
	}
 }
