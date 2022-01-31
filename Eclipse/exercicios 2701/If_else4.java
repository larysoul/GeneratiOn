package Familia44;

import java.util.Scanner;

public class If_else4 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num, par, impar;
		
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		impar = num * num;
		par = Math.sqrt(num);
		
		
		if(num % 2.0 == 0.0) {
		     System.out.println("Seu número é par! A raíz quadrada dele é: " + par);
		}
		else {
			System.out.println("Seu número é ímpar! A potência dele é: " + impar);
		}
	}
}
