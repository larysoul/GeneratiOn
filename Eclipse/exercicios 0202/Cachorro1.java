package POO44;

public class Cachorro1 extends Animal2 {
	
	public Cachorro1() {

		super("Cachorro");
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz au au au au au au...\n");
		}
	}

}
