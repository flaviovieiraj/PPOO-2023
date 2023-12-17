package menu;

import bebidas.Bebida;
import bebidas.Cafe;
import bebidas.CocaCola;

public class BebidaFactory {
	public Bebida criarBebida(String tipoBebida) {
		if(tipoBebida.equals(null)) {
			return null;
		}
		
		else if(tipoBebida.equals("Cafe")) {
			return new Cafe();
		}
		
		else if(tipoBebida.equals("CocaCola")) {
			return new CocaCola();
		}
		return null;
	}

}
