package POO44;

public class Eletronico {
	
	private String marca, cor;
	private String RAM, tela, camera;
	
	public Eletronico(String marca, String cor, String RAM, String tela, String camera) {
		
		this.marca = marca;
		this.cor = cor;
		this.RAM = RAM;
		this.tela = tela;
		this.camera = camera;
	}
	
	public void imprimirInfo() {
		System.out.println("Marca: "+marca+"\nCor: "+cor+"\nMemória RAM: "
	+RAM+"\nTamanho da tela: "+tela+"\nCamêra: "+camera);
	}
	
	void ligar() {
		System.out.println("\nO portadore efetuou uma ligação.");
	}
	
	void recusar() {
		System.out.println("\nO portadore recusou uma ligação.");
	}
	
	void receber() {
		System.out.println("\nO portadore recebeu uma ligção.");
	}
}
