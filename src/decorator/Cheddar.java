package decorator;

import pizza.Pizza;

public class Cheddar extends QueijoDecorator{
	Pizza pizza;

	public Cheddar(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Cheddar";
	}

	@Override
	public double preco() {
		return 3.0 + pizza.preco();
	}

}
