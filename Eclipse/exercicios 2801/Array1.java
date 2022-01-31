package Familia44;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int [] a = new int [6];
		int variavel;
		
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = 7;
		
		for(int x = 0; x < 6; x++) {
			System.out.println(a[x]);
			a[4] = 100;
		}
		
		variavel = a[0] + a[1] + a[5];
		System.out.println("\n"+variavel);
	}

}
