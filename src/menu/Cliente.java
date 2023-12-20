package menu;

import java.util.ArrayList;
import java.util.Scanner;

import bebidas.Bebida;

public class Cliente {
	static String tipoBebida = "";

	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Preparo preparo = new Preparo();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("O que deseja pedir?\n" + "1 - Pizza Salgada\n" + "2 - Pizza Doce\n" + "3 - Bebida\n"
					+ "4 - Já encerrei o pedido. Pedir a conta.");

			int opcao = scanner.nextInt();

			if (opcao == 1) {
				ArrayList<String> listaBorda = new ArrayList<>();
				ArrayList<String> listaCarne = new ArrayList<>();
				ArrayList<String> listaQueijo = new ArrayList<>();

				String tipoPizza = "Salgada";

				System.out.println("\n[Selecao de ingredientes adicionais]");
				Scanner scanCarne = new Scanner(System.in);
				
				for(int i = 0; i <2; i++) {
					System.out.println("[Tipos de carne]\n"
							+ "1- Frango\n"
							+ "2 - Bacon\n"
							+ "3 - Calabresa\n"
							+ "4 - Não quero mais carnes");
					
					int carne = scanCarne.nextInt();
					if(carne == 1) {
						listaCarne.add("Frango");
						System.out.println("Frango desfiado adicionado.");
					} else if(carne == 2) {
						listaCarne.add("Bacon");
						System.out.println("Bacon adicionado.");
					} else if(carne == 3) {
						listaCarne.add("Calabresa");
						System.out.println("Calabresa adicionada");
					} else break;
				}
				
				System.out.println("");
				
				Scanner scanQueijo = new Scanner(System.in);
				for(int i = 0; i < 2; i++) {
					System.out.println("[Queijos adicionais]\n"
							+ "1 - Cheddar\n"
							+ "2 - Coalho\n"
							+ "3 - Gorgonzola");
					int queijo = scanQueijo.nextInt();
					if (queijo == 1) {
						listaQueijo.add("Cheddar");
						System.out.println("Cheddar adicionado.");
					} else if( queijo == 2) {
						listaQueijo.add("Coalho");
						System.out.println("Queijo coalho adicionado.");
					} else if( queijo == 3) {
						listaQueijo.add("Gorgonzola");
						System.out.println("Queijo gorgonzola adicionado.");
					} else break;
				}
				
				System.out.println("");
				
				Scanner scanBorda = new Scanner(System.in);
				for(int i = 0; i <1; i++) {
					System.out.println("[Bordas]\n"
							+ "1 - CreamCheese\n"
							+ "2 - Catupiry");
					
					int borda = scanBorda.nextInt();
					if(borda == 1) {
						listaBorda.add("CreamCheese");
					} else if( borda== 2) {
						listaBorda.add("Catupiry");
					} else break;
				}
				
				System.out.println("");
				
				String[] arrayCarne = new String[listaCarne.size()];
				arrayCarne = listaCarne.toArray(arrayCarne);
				
				String[] arrayQueijo = new String[listaQueijo.size()];
				arrayQueijo = listaQueijo.toArray(arrayQueijo);
				
				String[] arrayBorda = new String[listaBorda.size()];
				arrayBorda = listaBorda.toArray(arrayBorda);
				
				PedidoPizzaSalgada pedidoSalgada = new PedidoPizzaSalgada(preparo, tipoPizza, arrayCarne, arrayQueijo, arrayBorda);
				atendente.anotarPedido(pedidoSalgada);

			}

			else if (opcao == 3) {
				Scanner scannerBebida = new Scanner(System.in);
				System.out.println("*** [ Bebidas ] ***");

				for (int i = 0; i < 1; i++) {
					System.out.println("1 - Coca Cola 1L [R$ 7,00]");
					System.out.println("2 - Café [R$ 2,00]");
					System.out.println("3 - Terminei a escolha de bebidas.");

					int bebida = scannerBebida.nextInt();
					if (bebida == 1) {
						tipoBebida = "CocaCola";
						System.out.println("Coca cola escolhida.");
					} else if (bebida == 2) {
						tipoBebida = "Cafe";
						System.out.println("Café escolhido");
					} else {
						break;
					}
				}

				PedidoBebida pedidoBebida = new PedidoBebida(preparo, tipoBebida);
				atendente.anotarPedido(pedidoBebida);

				System.out.println("Escolha de bebidas finalizada.");
			}

			else {
				System.out.println("Bom apetite!");

				// Conta

				System.out.println("*** Itens pedidos *** ");
				System.out.println("Valor total: R$ " + calcularConta(preparo));
				break;
			}
		}

	}

	private static double calcularConta(Preparo preparo) {
		double total = 0;
		for (Bebida bebida : preparo.getPedidos()) {
			System.out.println("- " + bebida.getDescricao() + " - " + bebida.preco());
			total += bebida.preco();

		}

		return total;
	}

}
