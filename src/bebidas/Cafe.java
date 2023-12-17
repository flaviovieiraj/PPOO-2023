package bebidas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cafe extends BebidaQuente {
	double valor = 2;

	@Override
	public double preco() {
		return valor;
	}

	@Override
	public String getDescricao() {
		return "Café";
	}

	@Override
	public void preparar() {
		System.out.println("Filtrando o café");
	}

	@Override
	public void incrementar() {
		System.out.println("Adicionando leite");
	}

	public boolean clienteQuerIncremento() {
		String resposta = getUserInput();

		if (resposta.toLowerCase().startsWith("s")) {
			valor = valor + 0.5;
			return true;
		} else
			return false;
	}

	private String getUserInput() {
		String resposta = null;
		System.out.println("Deseja adicionar leite por R$ 0,50? (s/n)");

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			resposta = input.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (resposta == null) {
			resposta = "n";
		}

		return resposta;
	}

}
