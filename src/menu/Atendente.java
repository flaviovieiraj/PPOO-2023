package menu;

public class Atendente {
	Command command;
	
	public void anotarPedido(Command c) {
		command = c;
		command.fazerPedido();
	}

}
