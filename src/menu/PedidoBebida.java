package menu;

public class PedidoBebida implements Command{
	
	Preparo preparo;
	String pedido;
	
	public PedidoBebida(Preparo preparo, String pedido) {
		this.preparo = preparo;
		this.pedido = pedido;
	}

	@Override
	public void fazerPedido() {
		preparo.tipoBebida = pedido;
		preparo.fazerPedido("Bebida");
		
	}

}
