package menu;

public class PedidoPizzaDoce implements Command{
	Preparo preparo;
	String[] listaDoce;
	String pedido;
	
	public PedidoPizzaDoce(Preparo preparo, String pedido, String[] listaDoce) {
		this.preparo = preparo;
		this.pedido = pedido;
		this.listaDoce = listaDoce;
	}
	@Override
	public void fazerPedido() {
		preparo.tipoPizza = pedido;
		preparo.listaDoce = this.listaDoce;
		preparo.fazerPedido("Doce");
		
	}

}
