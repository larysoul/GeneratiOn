package Familia44;

import java.util.Scanner;

public class While1 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0, contPessoas = 0;		
			
		while(idade != -99) {
			System.out.println("Informe a sua idade: ");
			idade = leia.nextInt();
			
			if(idade <= 21) {
				menos21++;
			}
			if(idade >= 50) {
				mais50++;
			}
			if(idade == -99) {
				System.out.println("Contagem encerrada.");
			} contPessoas++;
		}
		System.out.println("\nTotal de pessoas: " + contPessoas);
		System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Total de pessoas com mais de 50 anos: " + mais50);
	
	}

}
