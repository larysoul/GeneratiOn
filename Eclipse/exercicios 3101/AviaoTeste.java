package POO44;

public class AviaoTeste {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("S�o Paulo - SP", "Florian�polis - SC", "Azul", 19, 20);
		
		aviao1.imprimirInfo();
		aviao1.partida();
		aviao1.chegada();
		
	}
	
}
