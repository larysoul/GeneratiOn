package Familia44;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

	       Scanner leia = new Scanner(System.in);

	       List<Integer> numeroImpar = new ArrayList<>();

	       List<Integer> numeroPar = new ArrayList<>();

	       int numero, somaPar = 0;

	       for (int i = 0; i < 6; i++) {
	    	   System.out.println("Digite um n�mero:");
	           numero = leia.nextInt();  

	           

	           if (numero % 2 == 0){

	               numeroPar.add(numero);

	               somaPar += numero;

	           }else{

	               numeroImpar.add(numero);

	           }

	       }

	       System.out.println("N�meros pares digitados: " + numeroPar);

	       System.out.println("Soma dos n�meros pares: " + somaPar);

	       System.out.println("N�meros �mpares digitados: " + numeroImpar);

	       System.out.println("Quantidade de �mpares digitados: " + numeroImpar.size());        

	   }

	}