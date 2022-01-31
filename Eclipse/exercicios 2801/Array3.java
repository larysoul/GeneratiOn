package Familia44;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		int numM10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
			System.out.println("Digite o valor: ");
			matriz[x][y] = leia.nextInt();
			if(matriz[x][y] > 10) {
			numM10++;
				}
			}
		}
		System.out.println("\nA matriz possui "+numM10+" valor(es) maior(es) que 10");
	}
}
