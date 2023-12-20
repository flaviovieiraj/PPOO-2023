package menu;

import java.util.ArrayList;
import java.util.List;

import bebidas.Bebida;
import decorator.Brigadeiro;
import decorator.CreamCheese;
import decorator.Frango;
import decorator.Morango;
import decorator.Prestigio;
import pizza.Pizza;

public class Preparo {

	public static String tipoBebida = "";
	public static String tipoPizza = "";
	public static String[] listaDoce = null;
	public static String[] listaBorda = null;
	public static String[] listaCarne = null;
	public static String[] listaQueijo = null;

	Bebida bebida;
	Pizza pizza;

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
		} else if (factoryType.equalsIgnoreCase("Salgada")) {
			System.out.println("Pedido de " + tipoPizza + " anotado.");

			PizzaFactory factory = new PizzaFactory();
			pizza = factory.criarPizza(tipoPizza);

			pizza.prepararPizza(tipoPizza);
			pizza.assarPizza(tipoPizza);
			pizza.servirPizza(tipoPizza);

			pizza = decorarSalgada(listaBorda, listaCarne, listaQueijo);

			System.out.println("Pedido de " + pizza.getDescricao() + " completo.");
			System.out.println("valor: R$" + pizza.preco());

		} else if (factoryType.equalsIgnoreCase("Doce")) {
			System.out.println("Pedido de " + tipoPizza + " anotado.");

			PizzaFactory factory = new PizzaFactory();
			pizza = factory.criarPizza(tipoPizza);

			pizza.assarPizza(tipoPizza);
			pizza.prepararPizza(tipoPizza);
			pizza.servirPizza(tipoPizza);

			pizza = decorarDoce(listaDoce);

			System.out.println("Pedido de " + pizza.getDescricao() + " completo.");
			System.out.println("Valor: R$" + pizza.preco());
		}
		System.out.println("");
	}

	public List<Bebida> getPedidos() {
		return pedidos;
	}

	public Pizza decorarSalgada(String[] listaBorda, String[] listaCarne, String[] listaQueijo) {
		
		for(int i = 0; i< listaBorda.length; i++) {
			String borda = listaBorda[i];
			if(borda.equals("Creamcheese")) {
				pizza = new CreamCheese(pizza);
			}
			/*
			 * else if (borda.equals("Catupiry"){
			 * pizza= new Catupiry(pizza);
			 */
		}
		
		for(int i =0; i< listaCarne.length; i++) {
			String carne = listaCarne[i];
			if(carne.equals("Frango")) {
				pizza = new Frango(pizza);
			}
			
		}
		
		return pizza;
	}

	public Pizza decorarDoce(String[] listaDoce) {
		for(int i =0; i< listaDoce.length;i++) {
			String doce = listaDoce[i];
			if(doce.equals("Brigadeiro")) {
				pizza = new Brigadeiro(pizza);
			}
			else if(doce.equals("Morango")) {
				pizza = new Morango(pizza);
			}
			else if(doce.equals("Prestigio")) {
				pizza = new Prestigio(pizza);
			}
		}
		return pizza;
	}

}
