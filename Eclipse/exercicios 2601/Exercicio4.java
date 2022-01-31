package Familia44;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double A,B,C,R,S,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A:");
		A = leia.nextDouble();
		System.out.println("Entre com o valor de B:");
		B = leia.nextDouble();
		System.out.println("Entre com o valor de C:");
		C = leia.nextDouble();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S) / 2;
		
		System.out.println("O valor de D é: "+D);
		

	}

}
