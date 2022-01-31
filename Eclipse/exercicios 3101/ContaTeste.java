package POO44;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("Scar Boden", "****", "490.402.028-13");
		
		conta1.imprimirInfo();
		conta1.depositar();
	}

}
