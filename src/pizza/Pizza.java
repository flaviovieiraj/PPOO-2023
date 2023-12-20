package pizza;

public abstract class Pizza {
	String descricao="";
	
	public abstract double preco();
	
	public void rechearPizza(String tipo) {
		System.out.println("Recheando pizza "+ tipo);
	}
	
	public void assarPizza(String tipo) {
		System.out.println("Assando pizza "+ tipo);
	}
	
	public void servirPizza(String tipo) {
		System.out.println("Servindo pizza "+ tipo);
	}
	
	public String getDescricao() {
		return descricao;
	}

}
