package Familia44;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][]matriz1 = new int [2][2];
		int [][]matriz2 = new int [2][2];
		int [][]matrizSoma = new int [2][2];
		int [][]matrizSub = new int [2][2];
		int op;
		
		for(int x = 0; x < 2; x++) {
		for(int y = 0; y < 2; y++) {
				System.out.println("Informe o número para a primeira matriz: ");
				matriz1[x][y] = leia.nextInt();
				System.out.println("Informe um número para a segunda matriz: ");
				matriz2[x][y] = leia.nextInt();
			}
		}
		
		System.out.println("\tSelecione uma opção");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			
				System.out.println("A soma das matrizes é:");
			for(int y=0;y<2;y++) {
			for(int x=0;x<2;x++) {
					matrizSoma[x][y] = matriz1[x][y] + matriz2[x][y];
				}
			}
			for(int y=0; y<2;y++) {
			for(int x=0;x<2;x++) {
				System.out.print("["+(matrizSoma[x][y])+"] ");
				}
				System.out.print("\n");
			}
			break;
			
		case 2:
			
				System.out.println("A diferença das matrizes é:");
			for(int y=0;y<2;y++) {
			for(int x=0;x<2;x++) {
					matrizSub[x][y] = matriz2[x][y] - matriz1[x][y];
				}
			}
			for(int y=0; y<2;y++) {
			for(int x=0;x<2;x++) {
				System.out.print("["+(matrizSub[x][y])+"] ");
				}
				System.out.print("\n");
			}
			break;
			
		case 3:
				System.out.println("Informe um valor de constante para a primeira matriz: ");
			final int num1 = leia.nextInt();
				System.out.println("Informe um valor de constante para a segunda matriz: ");
			final int num2 = leia.nextInt();
			
			matriz1[0][0] = num1;
			matriz2[0][0] = num2;
			
			break;
			
		case 4:
			for(int y=0; y<2;y++) {
				for(int x=0;x<2;x++) {
				System.out.print("["+matriz1[x][y]+"] ");
				}
				System.out.print("\n");
			}
				System.out.print("\n");
			for(int y=0; y<2;y++) {
				for(int x=0;x<2;x++) {
				System.out.print("["+matriz2[x][y]+"] ");
				}
				System.out.print("\n");
			}
			break;
			default:
				System.out.println("Opção inválida!");
			break;
		}	
	}
}