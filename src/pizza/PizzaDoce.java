package pizza;

public class PizzaDoce extends Pizza {

	public PizzaDoce() {
		descricao = "Doce";
	}

	@Override
	public double preco() {
		return 10;
	}
}
