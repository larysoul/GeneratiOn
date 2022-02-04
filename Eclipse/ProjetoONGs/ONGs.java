package ProjetoONGs;

public class ONGs extends Pessoa {

	private int codigoO;

	public ONGs( String nome, String cpf, int idade ,int codigoO) {
		super(nome,cpf,idade);
		this.codigoO = codigoO;
	}

	public int getCodigoO() {
		return codigoO;
	}

	public void setCodigoO(int codigoO) {
		this.codigoO = codigoO;
	}

	public void imprimirOng() {
		System.out.println("\n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Idade: " + getIdade()
				+ "\n Codigo do Voluntario: " + codigoO);
	}
}
