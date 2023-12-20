package decorator;

import pizza.Pizza;

public class Brigadeiro extends DoceDecorator{
	Pizza pizza;

	public Brigadeiro(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Brigadeiro";
	}
	
	@Override
	public double preco() {
		return 5.0 + pizza.preco();
	}
}
