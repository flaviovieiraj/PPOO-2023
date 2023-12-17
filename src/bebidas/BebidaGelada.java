package bebidas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BebidaGelada implements Bebida {
	public abstract double preco();

	public abstract String getDescricao();

	// template
	public void prepararBebida() {
		abrirBebida();
		servirCopo();

		if (clienteQuerGelo()) {
			adicionarGelo();
		}

	}

	public void abrirBebida() {
		System.out.println("Abrindo embalagem da bebida");
	}

	public void servirCopo() {
		System.out.println("Colocando a bebida no copo");
	}

	public void adicionarGelo() {
		System.out.println("Adicionando gelo");
	}

	public boolean clienteQuerGelo() {
		String resposta = getResposta();

		if (resposta.toLowerCase().startsWith("s")) {
			return true;
		} else
			return false;
	}

	private String getResposta() {
		String resposta = null;
		System.out.println("Deseja adicionar gelo? (s/n)");

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
