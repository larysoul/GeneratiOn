package Familia44;

import java.util.Scanner;

public class If_else4 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num, par, impar;
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextDouble();
		
		impar = num * num;
		par = Math.sqrt(num);
		
		
		if(num % 2.0 == 0.0) {
		     System.out.println("Seu n�mero � par! A ra�z quadrada dele �: " + par);
		}
		else {
			System.out.println("Seu n�mero � �mpar! A pot�ncia dele �: " + impar);
		}
	}
}
