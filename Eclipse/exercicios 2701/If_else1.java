package Familia44;

import java.util.Scanner;

public class If_else1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero:");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO maior n�mero �: "+n1);
		}
		
		if (n2 > n1 && n2 > n3) {
			System.out.println("\nO maior n�mero �: "+n2);
		}
		
		if (n3 > n1 && n3 > n2) {
			System.out.println("\nO maior n�mero �: "+n3);
		}
		else {
			System.out.println("Os n�meros digitados s�o inv�lidos!");
		}

	}

}
