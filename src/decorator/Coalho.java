package decorator;

import pizza.Pizza;

public class Coalho extends QueijoDecorator{
	Pizza pizza;
	
	public Coalho(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Coalho";
	}
	@Override
	public double preco() {
		return 2 + pizza.preco();
	}

}
