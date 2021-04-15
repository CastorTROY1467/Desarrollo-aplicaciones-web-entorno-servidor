import java.util.ArrayList;

public class Familia {
	private ArrayList<Persona> miembros;

	public Familia() {
		this.miembros = new ArrayList<Persona>();
	}
	
	/**
	 * 
	 * @param Persona p		Objeto de tipo Persona que queremos añadir a la lista de miembros.
	 */
	public void agregar(Persona p) {
		miembros.add(p);
	}
	
	/**
	 * Recorremos el ArrayList y llamamos al método mostrar de cada uno de los elementos persona de la lista.
	 */
	public void mostrarMiembros() {
		for(int i = 0; i < miembros.size(); i++)
			miembros.get(i).mostrar();
	}
}
