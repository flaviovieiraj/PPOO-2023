package decorator;

import pizza.Pizza;

public class Prestigio extends DoceDecorator{
	Pizza pizza;
	
	public Prestigio(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public double preco() {
		return 7.0 + pizza.preco();
	}
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Prestigio";
	}

}
