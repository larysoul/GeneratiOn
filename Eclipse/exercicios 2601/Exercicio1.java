package Familia44;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int dia,mes,ano,totalDia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos? ");
		ano = leia.nextInt();
		System.out.println("Quantos meses? ");
		mes = leia.nextInt();
		System.out.println("Quantos dias? ");
		dia = leia.nextInt();
		
		ano = ano * 365;
		mes = mes * 30;
		
		totalDia = ano + mes + dia;
		
		System.out.println("Fazem "+totalDia+" dias que você nasceu." );
	}

}
