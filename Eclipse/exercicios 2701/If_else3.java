package Familia44;

import java.util.Scanner;

public class If_else3 {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria � Infantil!");
		} else if ( idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria � Juvenil!");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria � Adulta!");
		}
		else {
			System.out.println("Infelizmente n�o temos uma categoria para a sua idade! :(");
		}
	}

}
