package menu;

import java.util.ArrayList;
import java.util.List;

import bebidas.Bebida;
import decorator.Bacon;
import decorator.Banana;
import decorator.Brigadeiro;
import decorator.Calabresa;
import decorator.Catupiry;
import decorator.Cheddar;
import decorator.Coalho;
import decorator.CreamCheese;
import decorator.Frango;
import decorator.Gorgonzola;
import decorator.Morango;
import decorator.Prestigio;
import pizza.Pizza;
import pizza.PizzaSalgada;

public class Preparo {

	public static String tipoBebida = "";
	public static String tipoPizza = "";
	public static String[] listaDoce = null;
	public static String[] listaFruta = null;
	public static String[] listaBorda = null;
	public static String[] listaCarne = null;
	public static String[] listaQueijo = null;

	Bebida bebida;
	Pizza pizza;

	private List<Bebida> bebidasPedidas = new ArrayList<>();
	private List<Pizza> pizzasPedidas = new ArrayList<>();

	public void fazerPedido(String factoryType) {
		if (factoryType.equalsIgnoreCase("Bebida")) {
			System.out.println("Pedido de " + tipoBebida + " anotado.");

			BebidaFactory factory = new BebidaFactory();
			bebida = factory.criarBebida(tipoBebida);

			if (bebida != null) {
				bebida.prepararBebida();

				bebidasPedidas.add(bebida);

				System.out.println("Pedido de " + bebida.getDescricao() + " completo.");
				System.out.println("Valor: R$" + bebida.preco());
			}
		} else if (factoryType.equalsIgnoreCase("Salgada")) {
			System.out.println("Pedido de pizza " + tipoPizza + " anotado.");

			PizzaFactory factory = new PizzaFactory();
			pizza = factory.criarPizza(tipoPizza);

			pizza.rechearPizza(tipoPizza);
			pizza.assarPizza(tipoPizza);
			pizza.servirPizza(tipoPizza);

			pizza = decorarSalgada(listaBorda, listaCarne, listaQueijo);

			pizzasPedidas.add(pizza);

			System.out.println("Pedido de pizza " + pizza.getDescricao() + " completo.");
			System.out.println("valor: R$" + pizza.preco());

		} else if (factoryType.equalsIgnoreCase("Doce")) {
			System.out.println("Pedido de pizza " + tipoPizza + " anotado.");

			PizzaFactory factory = new PizzaFactory();
			pizza = factory.criarPizza(tipoPizza);

			pizza.assarPizza(tipoPizza);
			pizza.rechearPizza(tipoPizza);
			pizza.servirPizza(tipoPizza);

			pizza = decorarDoce(listaDoce, listaFruta);

			pizzasPedidas.add(pizza);

			System.out.println("Pedido de pizza " + pizza.getDescricao() + " completo.");
			System.out.println("Valor: R$" + pizza.preco());
		}
		System.out.println("");
	}

	public List<Bebida> getPedidosBebida() {
		return bebidasPedidas;
	}

	public List<Pizza> getPedidosPizza() {
		return pizzasPedidas;
	}

	public Pizza decorarSalgada(String[] listaBorda, String[] listaCarne, String[] listaQueijo) {
		

		for (int i = 0; i < listaCarne.length; i++) {
			String carne = listaCarne[i];
			if (carne.equals("Frango")) {
				pizza = new Frango(pizza);
			} else if (carne.equals("Bacon")) {
				pizza = new Bacon(pizza);
			} else if (carne.equals("Calabresa")) {
				pizza = new Calabresa(pizza);
			}

		}

		for (int i = 0; i < listaQueijo.length; i++) {
			String queijo = listaQueijo[i];
			if (queijo.equals("Cheddar")) {
				pizza = new Cheddar(pizza);
			} else if (queijo.equals("Coalho")) {
				pizza = new Coalho(pizza);
			} else if (queijo.equals("Gorgonzola")) {
				pizza = new Gorgonzola(pizza);
			}
		}
		
		for (int i = 0; i < listaBorda.length; i++) {
			String borda = listaBorda[i];
			if (borda.equals("CreamCheese")) {
				pizza = new CreamCheese(pizza);
			} else if (borda.equals("Catupiry")) {
				pizza = new Catupiry(pizza);
			}
		}
	    
		return pizza;
	}

	public Pizza decorarDoce(String[] listaDoce, String[] listaFruta) {
		for (int i = 0; i < listaDoce.length; i++) {
			String doce = listaDoce[i];
			if (doce.equals("Brigadeiro")) {
				pizza = new Brigadeiro(pizza);
			}  else if (doce.equals("Prestigio")) {
				pizza = new Prestigio(pizza);
			}
		}
		
		for(int i =0; i< listaFruta.length; i++) {
			String fruta = listaFruta[i];
			if(fruta.equals("Morango")) {
				pizza = new Morango(pizza);
			} else if(fruta.equals("Banana")) {
				pizza = new Banana(pizza);
			}
			
		}
		return pizza;
	}

}
