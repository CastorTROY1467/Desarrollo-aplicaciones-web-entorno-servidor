import paqueteActivos.Accion;
import paqueteActivos.Criptomoneda;
import paqueteCartera.Cartera;
import paqueteUsuario.Usuario;

public class Lanzadera {

	public static void main(String[] args) {
		Accion coca_cola = new Accion("KO", "Coca-Cola", 54.60, "21/04/2021");
		Criptomoneda bitcoin = new Criptomoneda("BTC", "Bitcoin", 46201.07, "21/04/2021");
		
		Usuario usuario = new Usuario("Pedro", "contraseñaSecreta", "pedroElInversor@gmail.com");
		
		Cartera cartera = new Cartera(usuario);
		
		cartera.agregarAccion(coca_cola, 10);
		cartera.agregarCripto(bitcoin, 10);
		
		cartera.mostrarPortfolio();
		
		cartera.eliminarAccion(coca_cola, 10);
		cartera.eliminarCripto(bitcoin, 5);
		cartera.mostrarPortfolio();
	}
}
