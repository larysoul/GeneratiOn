package Familia44;

import java.util.Scanner;

public class If_else2 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	double n1, n2, n3;
	
	System.out.println("Digite o primeiro n�mero: ");
	n1 = leia.nextDouble();
	System.out.println("\nDigite o segundo n�mero: ");
	n2 = leia.nextDouble();
	System.out.println("\nDigite o terceiro n�mero: ");
	n3 = leia.nextDouble();
	
	if(n1 <= n2 && n2 <= n3) {
		System.out.println("A ordem crescente �: " + n1 + ", " + n2 + ", " + n3 + ".");
	}
	else if(n1 <= n3 && n3 <= n2) {
		System.out.println("A ordem crescente �: " + n1 + ", " + n3 + ", " + n2 + "." ); 
	}
	else if(n2 <= n1 && n1 <= n3) {
		System.out.println("A ordem crescente �: " + n2 + ", " + n1 + ", " + n3 + "." );
	}
	else if(n2 <= n3 && n3 <= n1) {
		System.out.println("A ordem crescente �: " + n2 + ", " + n3 + ", " + n1 + "." );
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente �: " + n3 + ", " + n1 + ", " + n2 + "." );
	}
	else if(n3 <= n2 && n2 <= n1) {
		System.out.println("A ordem crescente �: " + n3 + ", " + n2 + ", " + n1 + "." );
		}
	
	}

}