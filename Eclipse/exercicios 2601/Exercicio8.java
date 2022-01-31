package Familia44;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double custoFab, custoConsu;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o custo de fábrica?");
		custoFab = leia.nextDouble();
		
		custoConsu = custoFab + (custoFab*0.28) + (custoFab*0.45);
		
		System.out.println("O custo do consumidor é de: RS"+custoConsu);
		
	}

}
