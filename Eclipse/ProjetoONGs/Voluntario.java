package ProjetoONGs;

public class Voluntario extends Pessoa {

	private int codigoV;

	public Voluntario(String nome, String cpf, int idade, int codigoV) {
		super(nome, cpf, idade);
		this.codigoV = codigoV;
	}

	String nome1, cpf1;
	int idade1, codigo1;

	public int getCodigoV() {
		return codigoV;
	}

	public void setCodigoV(int codigoV) {
		this.codigoV = codigoV;
	}

	public void imprimirVoluntario() {
		System.out.println("\n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Idade: " + getIdade()
				+ "\n Codigo do Voluntario: " + codigoV);
	}
}