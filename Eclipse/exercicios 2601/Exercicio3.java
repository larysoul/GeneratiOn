package Familia44;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int totalSeg, seg, min, hora;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento?");
		totalSeg = leia.nextInt();
		
		hora = totalSeg / 3600;
		min = (totalSeg%3600) / 60;
		seg = totalSeg%3600%60;
		
		System.out.println("O evento durou "+hora+" horas, "+min+" minutos e "+seg+" segundos.");

	}

}
