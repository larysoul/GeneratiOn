package POO44;

public class Cliente {
	
		String nome, email, cpf, numeroTel;
		private int idade;
		
		public Cliente(String nome, String email, String cpf, String numeroTel, int idade)
		
		{
			this.nome = nome;
			this.email = email;
			this.cpf = cpf;
			this.numeroTel = numeroTel;
			this.idade = idade;
		}
		
		public void imprimirInfo() {
			System.out.println("\nNome do cliente: "+nome+"\nEmail: "+email+"\nCPF: "
					+cpf+"\nNúmero de Telefone: "+numeroTel+"\nIdade: "+idade);
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
		public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	
	void pagar() {
		System.out.println("\nO cliente pagou pelo produto.");
	}
	void devolver() {
		System.out.println("\nO cliente devolveu o produto.");
	}
	void reembolso() {
		System.out.println("\nO cliente solicitou o reembolso do produto.");
	}
	void trocar() {
		System.out.println("\nO cliente solicitou a troca do produto.");
	}
	
}
