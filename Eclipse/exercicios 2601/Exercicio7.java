package Familia44;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor de A:");
		a = leia.nextDouble();
		System.out.println("Entre com valor de B:");
		b = leia.nextDouble();
		System.out.println("Entre com valor de C:");
		c = leia.nextDouble();
		System.out.println("Entre com valor de D:");
		d = leia.nextDouble();
		System.out.println("Entre com valor de E:");
		e = leia.nextDouble();
		System.out.println("Entre com valor de F:");
		f = leia.nextDouble();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("O valor de x é: "+x+ "\nO valor de y é "+y);

	}

}
