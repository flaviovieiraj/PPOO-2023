package menu;

public class PedidoPizzaDoce implements Command{
	Preparo preparo;
	String[] listaDoce, listaFruta;
	String pedido;
	
	public PedidoPizzaDoce(Preparo preparo, String pedido, String[] listaDoce, String[] listaFruta) {
		this.preparo = preparo;
		this.pedido = pedido;
		this.listaDoce = listaDoce;
		this.listaFruta = listaFruta;
	}
	@Override
	public void fazerPedido() {
		preparo.tipoPizza = pedido;
		preparo.listaDoce = this.listaDoce;
		preparo.listaFruta = this.listaFruta;
		preparo.fazerPedido("Doce");
		
	}

}
