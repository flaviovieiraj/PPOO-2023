package decorator;

import pizza.Pizza;

public class Gorgonzola extends QueijoDecorator{
	Pizza pizza;
	
	public Gorgonzola(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Gorgonzola";
	}

	@Override
	public double preco() {
		return 6 + pizza.preco();
	}

}
