package POO44;

public class TesteAnimal1 {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Lua", 2, true, "anda", "shitzu.");
		Cavalo cavalo1 = new Cavalo("Beleza Negra", 27, true, "galopa", "preto.");
		Preguica preg1 = new Preguica("Flash", 35, false, "dorme", "marrom-claro.");
		

		cachorro1.infoCachorro();
		System.out.println();
		cavalo1.infoCavalo();
		System.out.println();
		preg1.infoPreguica();
	}
}
