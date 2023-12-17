package menu;

import java.util.Scanner;

import bebidas.Bebida;

public class Cliente {
	static String tipoBebida="";
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Preparo preparo = new Preparo();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("O que deseja pedir?\n"
					+ "1 - Pizza\n"
					+ "2 - Bebida\n"
					+ "3 - Já encerrei o pedido. Pedir a conta.");
			
			int opcao = scanner.nextInt();
			if(opcao == 2) {
				Scanner scannerBebida = new Scanner(System.in);
				System.out.println("*** [ Bebidas ] ***");
				
				for(int i = 0; i<1; i++) {
					System.out.println("1 - Coca Cola 1L [R$ 7,00]");
					System.out.println("2 - Café [R$ 2,00]");
					System.out.println("3 - Terminei a escolha de bebidas.");
					
					int bebida = scannerBebida.nextInt();
					if(bebida == 1) {
						tipoBebida = "CocaCola";
						System.out.println("Coca cola escolhida.");
					}
					else if(bebida == 2) {
						tipoBebida = "Cafe";
						System.out.println("Café escolhido");
					}
					else {
						break;
					}
				}
				
				System.out.println("Escolha de bebidas finalizada.");
				
				PedidoBebida pedidoBebida = new PedidoBebida(preparo, tipoBebida);
				atendente.anotarPedido(pedidoBebida);
			}
			
			else {
				System.out.println("Bom apetite!");
				
				// Conta
				
				System.out.println("*** Itens pedidos *** ");
				System.out.println("Valor total: R$ "+ calcularConta(preparo));
				break;
			}
		}
		
	}
	
	private static double calcularConta(Preparo preparo) {
		double total = 0;
		for (Bebida bebida : preparo.getPedidos()) {
			System.out.println("- "+ bebida.getDescricao() + " - " + bebida.preco());
			total += bebida.preco();
			
		}
		
		return total;
	}

}
