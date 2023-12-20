package menu;

public class PedidoPizzaSalgada implements Command{
	Preparo preparo;
	String[] listaBorda, listaCarne, listaQueijo;
	String pedido;
	
	public PedidoPizzaSalgada(Preparo preparo, String pedido, String[] listaBorda, String[] listaCarne, String[] listaQueijo) {
		this.preparo = preparo;
		this.pedido = pedido;
		this.listaBorda = listaBorda;
		this.listaCarne = listaCarne;
		this.listaQueijo = listaQueijo;
	}

	@Override
	public void fazerPedido() {
		preparo.tipoPizza = pedido;
		preparo.listaBorda = this.listaBorda;
		preparo.listaCarne = this.listaCarne;
		preparo.listaQueijo = this.listaQueijo;
		preparo.fazerPedido("Salgada");
		
		
	}

}
