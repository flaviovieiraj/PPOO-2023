package decorator;

import pizza.Pizza;

public class Bacon extends CarneDecorator{
	Pizza pizza;
	
	public Bacon(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Bacon";
	}

	@Override
	public double preco() {
		return 5 + pizza.preco();
	}

}
