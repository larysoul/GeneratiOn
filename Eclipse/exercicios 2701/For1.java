package Familia44;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		for(int num = 1000; num < 2000; num++) {
			if(num%11 == 5) {
				System.out.println(num+"\n");
			}
		}
	}
}
