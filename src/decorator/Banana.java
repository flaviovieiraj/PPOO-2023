package decorator;

import pizza.Pizza;

public class Banana extends FrutaDecorator{
	Pizza pizza;
	
	public Banana (Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDescricao() {
		return pizza.getDescricao() + ", Banana";
	}

	@Override
	public double preco() {
		return 2.0 + pizza.preco();
	}

}
