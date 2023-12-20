package menu;

import pizza.Pizza;
import pizza.PizzaDoce;
import pizza.PizzaSalgada;

public class PizzaFactory {
	public Pizza criarPizza(String tipoPizza) {
		if(tipoPizza.equals(null)) {
			return null;
		}
		else if(tipoPizza.equals("Salgada")) {
			return new PizzaSalgada();
		}
		else if(tipoPizza.equals("Doce")) {
			return new PizzaDoce();
		}
		return null;
		
	}

}
