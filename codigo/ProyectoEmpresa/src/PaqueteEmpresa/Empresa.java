package PaqueteEmpresa;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Fontanero> fontaneros;
	private ArrayList<Pintor> pintores;
	private ArrayList<Cliente> clientes;
	
	/**
	 * @param pintores
	 * @param clientes
	 * @param fontaneros
	 */
	public Empresa() {
		this.fontaneros = new ArrayList<Fontanero>();
		this.pintores = new ArrayList<Pintor>();
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Fontanero> getFontaneros() {
		return fontaneros;
	}

	public void setFontaneros(ArrayList<Fontanero> fontaneros) {
		this.fontaneros = fontaneros;
	}

	public ArrayList<Pintor> getPintores() {
		return pintores;
	}

	public void setPintores(ArrayList<Pintor> pintores) {
		this.pintores = pintores;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void agregarFontanero(Fontanero i) {
		fontaneros.add(i);
	}
	
	public void agregarPintor(Pintor t) {
		pintores.add(t);
	}
	
	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void mostrarFontaneros() {
		System.out.println();
		System.out.println("Lista de fontaneros");
		System.out.println("---------------------");
		
		for (Fontanero fontanero : fontaneros) {
			fontanero.mostrar();
		}
	}
	
	public void mostrarPintores() {
		System.out.println();
		System.out.println("Lista de pintores");
		System.out.println("---------------------");
		
		for (Pintor pintor : pintores) {
			pintor.mostrar();
		}
	}
	
	public void mostrarClientes() {
		System.out.println();
		System.out.println("Lista de clientes");
		System.out.println("---------------------");
		
		for (Cliente cliente: clientes) {
			cliente.mostrar();
		}
	}
}
