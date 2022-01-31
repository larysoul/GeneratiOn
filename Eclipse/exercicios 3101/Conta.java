package POO44;

public class Conta {

	private String nome, senha, cpf;
	
	public Conta(String nome, String senha, String cpf) {
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public void imprimirInfo() {
		System.out.println("Titular da conta: "+nome+"\nSenha: "+senha+"\nCPF: "+cpf);
	}
	
	public void sacar() {
		System.out.println("\nO titular sacou X valor.");
	}
	
	public void depositar() {
		System.out.println("\nO titular depositou X valor.");
	}
}
