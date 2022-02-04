package ProjetoONGs;

public class Parceiro extends Pessoa {

	private int codigoP;

	public Parceiro(String nome, String cpf, int idade, int codigoP) {
		super(nome, cpf, idade);
		this.codigoP = codigoP;
	}

	public int getCodigoP() {
		return codigoP;
	}

	public void setCodigoP(int codigoP) {
		this.codigoP = codigoP;
	}

	public void cadastrarParceiro() {

	}

	public void imprimirParceiro() {
		System.out.println("\n Nome: " + getNome() + "\n CPF: " + getCpf() + "\n Idade: " + getIdade()
				+ "\n Codigo do Voluntario: " + codigoP);
	}
}