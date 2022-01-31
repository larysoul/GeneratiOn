package Familia44;

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, numP = 1, sexo, caracteristica, 
			pc = 0, mn = 0, ha = 0, oc = 0, pc40 = 0, pc18 = 0;
	    
		
		while(numP <= 2) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe o gênero: \n1 Feminino; "
					+ "\n2 Masculino; \n3 Outros. ");
			sexo = leia.nextInt();
			
			System.out.println("Digite a característica: \n1 Calma; "
					+ "\n2 Nervosa; \n3 Agressiva. ");
			caracteristica = leia.nextInt();
			
		if(caracteristica == 1) {
			pc++;
		}
		if(sexo == 1 && caracteristica == 2) {
		      mn++;
		}
		if(sexo == 2 && caracteristica == 3) {
			ha++;
		}
		if(sexo == 3 && caracteristica == 1) {
			oc++;
		}
		if(idade >= 40 && caracteristica == 2) {
			pc40++;
		}
		if(idade <= 18 && caracteristica == 1) {
			pc18++;
		}
		numP++;

		}
		
		System.out.println("Entre os individuos entrevistados, " + pc 
				+ " se consideram calmos; "
				+ "" + mn + " mulher(es) se consideram nervosas; " +ha 
				+ " \nhomen(s) se consideram agressivos; " + oc 
				+ " pessoas de outros genêros se consideram calmas; " + pc40 
				+ " \npessoas acima dos 40 anos se consideram nervosas e " + pc18 
				+ " pessoas abaixo dos 18 anos se consideram calmas.");
	}
}