package decorator;

import pizza.Pizza;

public class CreamCheese extends BordaDecorator{
	Pizza pizza;
	
	public CreamCheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + " com borda de Creamcheese";
	}

	@Override
	public double preco() {
		return 3.0 + pizza.preco();
	}

}
