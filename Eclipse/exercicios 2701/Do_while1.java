package Familia44;

import java.util.Scanner;

public class Do_while1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n, soma = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
						
			soma += n;
		}
		
		while(n != 0); {
			System.out.println("A soma dos n�meros �: " + soma);		
			
		}
	}
}
