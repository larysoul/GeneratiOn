package POO44;

public class Patinete {
	
	private String cor, acessorios, categoria;
	
	public Patinete(String cor, String acessorios, String categoria) {
		this.cor = cor;
		this.acessorios = acessorios;
		this.categoria = categoria;
	}
	
	public void imprimirInfo() {
		System.out.println("Cor: "+cor+"\nAcess�rios inclusos: "+acessorios+
				"\nCategoria: "+categoria);
	}
	
	void valor() {
		System.out.println("\nO valor do patinete � de R$179.99");
	}
}
