package POO44;

public class Preguica1 extends Animal2 {
	
	public Preguica1() {

		super("Preguiça");
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("A " + getEspecie() + " faz AAAAAAAAAAAAAAAAAAAA*grito agudo*...\n");
		}
	}
}
