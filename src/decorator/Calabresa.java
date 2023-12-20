package decorator;

import pizza.Pizza;

public class Calabresa extends CarneDecorator{
	Pizza pizza;
	
	public Calabresa(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Calabresa";
	}

	@Override
	public double preco() {
		return 3 + pizza.preco();
	}

}
