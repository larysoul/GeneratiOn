package Familia44;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota:");
		nota1 = leia.nextDouble();
		System.out.println("Insira a segunda nota:");
		nota2 = leia.nextDouble();
		System.out.println("Insira a terceira nota:");
		nota3 = leia.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
		
		System.out.println("A média ponderada das notas é de: "+media);
	}

}
