package bebidas;

public abstract class BebidaQuente implements Bebida{
	public abstract double preco();
	public abstract String getDescricao();
	
	public void prepararBebida() {
		ferverAgua();
		preparar();
		servirCopo();
		
		if(clienteQuerIncremento()) {
			incrementar();
		}
		
	}
	
	public void ferverAgua() {
		System.out.println("Fervendo agua");
	}
	
	public abstract void preparar();
	
	public void servirCopo() {
		System.out.println("Servindo no copo");
	}
	
	public abstract void incrementar();
	
	boolean clienteQuerIncremento() {
		return true;
	}

}
