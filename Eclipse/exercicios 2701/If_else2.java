package Familia44;

import java.util.Scanner;

public class If_else2 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	double n1, n2, n3;
	
	System.out.println("Digite o primeiro número: ");
	n1 = leia.nextDouble();
	System.out.println("\nDigite o segundo número: ");
	n2 = leia.nextDouble();
	System.out.println("\nDigite o terceiro número: ");
	n3 = leia.nextDouble();
	
	if(n1 <= n2 && n2 <= n3) {
		System.out.println("A ordem crescente é: " + n1 + ", " + n2 + ", " + n3 + ".");
	}
	else if(n1 <= n3 && n3 <= n2) {
		System.out.println("A ordem crescente é: " + n1 + ", " + n3 + ", " + n2 + "." ); 
	}
	else if(n2 <= n1 && n1 <= n3) {
		System.out.println("A ordem crescente é: " + n2 + ", " + n1 + ", " + n3 + "." );
	}
	else if(n2 <= n3 && n3 <= n1) {
		System.out.println("A ordem crescente é: " + n2 + ", " + n3 + ", " + n1 + "." );
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente é: " + n3 + ", " + n1 + ", " + n2 + "." );
	}
	else if(n3 <= n2 && n2 <= n1) {
		System.out.println("A ordem crescente é: " + n3 + ", " + n2 + ", " + n1 + "." );
		}
	
	}

}