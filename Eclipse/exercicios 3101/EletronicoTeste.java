package POO44;

public class EletronicoTeste {

	public static void main(String[] args) {
		
		Eletronico eletronico1 = new Eletronico("Samsung A11", "Vermelho", 
				"3 GB", "6.4'", "13 MP + 5 MP + 2 MP");
		
		eletronico1.imprimirInfo();
		eletronico1.ligar();
	}
}
