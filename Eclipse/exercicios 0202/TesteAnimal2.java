package POO44;

import java.util.Scanner;

public class TesteAnimal2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Cachorro1 cachorro = new Cachorro1();
		Cavalo1 cavalo = new Cavalo1();
		Preguica1 preg = new Preguica1();
		
		Animal2 animais = null;
		
		int op;
		
		do {
			
			System.out.println("Escolha um animal:\n1-Cachorro\n2-Cavalo\n3-Preguiça");
			op = leia.nextInt();
			switch(op) {
			case 1: animais = cachorro; break;
			case 2: animais = cavalo; break;
			case 3: animais = preg; break;
			default: System.out.println("Opção inválida!");
			}
			
			if(animais != null)
			{
				animais.som((Math.random() * 3.0));
			}
			 
			}while (op < 4 || op > 1);
	
	}
}
