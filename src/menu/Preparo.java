package menu;

import java.util.ArrayList;
import java.util.List;

import bebidas.Bebida;

public class Preparo {

	public static String tipoBebida = "";
	Bebida bebida;
	private List<Bebida> pedidos = new ArrayList<>();

	public void fazerPedido(String factoryType) {
		if (factoryType.equalsIgnoreCase("Bebida")) {
			System.out.println("Pedido de " + tipoBebida + " anotado.");

			BebidaFactory factory = new BebidaFactory();
			bebida = factory.criarBebida(tipoBebida);

			if (bebida != null) {
				bebida.prepararBebida();

				pedidos.add(bebida);

				System.out.println("Pedido de " + bebida.getDescricao() + " completo.");
				System.out.println("Valor: R$" + bebida.preco());
			}
		}
		System.out.println("");
	}

	public List<Bebida> getPedidos() {
		return pedidos;
	}

}
