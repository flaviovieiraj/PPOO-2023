package decorator;

import pizza.Pizza;

public class Morango extends DoceDecorator{
	Pizza pizza;
	
	public Morango(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Morango";
	}
	
	@Override
	public double preco() {
		return 5.0 + pizza.preco();
	}

}
