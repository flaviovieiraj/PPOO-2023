package decorator;

import pizza.Pizza;

public class Catupiry extends BordaDecorator {
	Pizza pizza;

	public Catupiry(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + " com borda de Catupiry";
	}

	@Override
	public double preco() {
		return 3 + pizza.preco();
	}

}
