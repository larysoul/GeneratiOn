package POO44;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Scar Boden", 3500, 160, 130);

		funcionario1.imprimirInfo();
		funcionario1.totalH(0);
		funcionario1.bonus();
	}

}
