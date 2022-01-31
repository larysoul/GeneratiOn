package Familia44;

import java.util.Scanner;

public class Do_while2 {

		public static void main(String[] args) {
			
			 Scanner leia = new Scanner(System.in);
			 
			 int n = 0;
			 double media = 0.0, multiplos = 0.0, soma = 0.0;
			 
			 do {
				 System.out.println("Digite um número do teclado: ");
				 n = leia.nextInt();
				 
				 if(n % 3 == 0 && n != 0) {
					 multiplos++;
					 
					soma += n; }
						 
			 }
			 
			 while(n != 0);
			 media = soma / multiplos;
			 
			 System.out.println("A média dos números múltiplos de 3 é: " + media);
	}
}
