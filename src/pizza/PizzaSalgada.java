package pizza;

public class PizzaSalgada extends Pizza{
	public PizzaSalgada() {
		descricao = "Salgada";
	}

	@Override
	public double preco() {
		return 20.00;
	}
}
