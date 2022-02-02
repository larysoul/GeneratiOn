package POO44;

public class Cavalo1 extends Animal2 {
	
	public Cavalo1() {

		super("Cavalo");
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz Irrinrrinrrón...\n");
		}
	}
}
