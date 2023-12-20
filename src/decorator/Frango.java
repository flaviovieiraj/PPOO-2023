package decorator;

import pizza.Pizza;

public class Frango extends CarneDecorator{
	Pizza pizza;
	
	public Frango(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Frango";
	}

	@Override
	public double preco() {
		return 4.0 + pizza.preco();
	}

}
