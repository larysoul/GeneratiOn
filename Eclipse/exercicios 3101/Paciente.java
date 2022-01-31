package POO44;

public class Paciente {
	
	private String nome, doc, pulseira;
	
	public Paciente(String nome, String doc, String pulseira) {
		this.nome = nome;
		this.doc = doc;
		this.pulseira = pulseira;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome do Paciente: "+nome+"\nDocumento: "
							+doc+"\nCor da pulseira: "+pulseira);
	}
	
	public void vermelha() {
		System.out.println("\nEmergência.");
	}
	public void laranja() {
		System.out.println("\nMuita Urgência.");
	}
	public void amarela() {
		System.out.println("\nUrgência.");
	}
	public void verde() {
		System.out.println("\nPouca Urgência.");
	}
	public void azul() {
		System.out.println("\nNão Urgência.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getPulseira() {
		return pulseira;
	}

	public void setPulseira(String pulseira) {
		this.pulseira = pulseira;
	}
}
