package POO44;

public class Aviao {

	private String origem, destino, linha;
	private int assento1, assento2;
	
	public Aviao(String origem, String destino, String linha, int assento1, int assento2) {
		
		this.origem = origem;
		this.destino = destino;
		this.linha = linha;
		this.assento1 = assento1;
		this.assento2 = assento2;
	}
	
	public void imprimirInfo() {
		System.out.println("Origem: "+origem+"\nDestino: "+destino+"\nLinha Aérea: "
	+linha+"\nNúmero(s) do(s) assento(s): "+assento1+" e "+assento2);
	}
	
	void partida() {
		System.out.println("\nHorário de partida previsto para 13:20h");
	}
	
	void chegada() {
		System.out.println("Horário de chegada previsto para 15:30h");
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public int getAssento1() {
		return assento1;
	}

	public void setAssento1(int assento1) {
		this.assento1 = assento1;
	}

	public int getAssento2() {
		return assento2;
	}

	public void setAssento2(int assento2) {
		this.assento2 = assento2;
	}
}
