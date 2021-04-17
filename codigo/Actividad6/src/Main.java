import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Perro labrador = new Perro("Perro", 499.99f, "Labrador");
		Perro borderCollie = new Perro("Perro", 499.99f, "Border Collie");
		Perro pastorAleman = new Perro("Perro", 499.99f, "Pastor Aleman");
		Perro pastorBelga = new Perro("Perro", 499.99f, "Pastor Belga");
		
		Pez pezPayaso = new Pez("Pez Payaso (Amphiprion ocellaris)", 10.55f, null);
		Pez pezBetta = new Pez("Pez Betta (Betta splendens)", 10.55f, null);
		Pez pezAngel = new Pez("Pez Angel (Pterophyllum scalare)", 10.55f, null);
		
		ArrayList<Pez> incompatiblesPezPayaso = new ArrayList<Pez>(List.of(pezBetta, pezAngel));
		ArrayList<Pez> incompatiblesPezBetta = new ArrayList<Pez>(List.of(pezPayaso, pezAngel));
		ArrayList<Pez> incompatiblesPezAngel = new ArrayList<Pez>(List.of(pezBetta, pezPayaso));
		
		pezPayaso.setPecesIncompatibles(incompatiblesPezPayaso);
		pezBetta.setPecesIncompatibles(incompatiblesPezBetta);
		pezAngel.setPecesIncompatibles(incompatiblesPezAngel);
		
		labrador.mostrar();
		pezPayaso.mostrar();
	}
}
