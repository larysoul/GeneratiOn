package Familia44;

import java.util.Scanner;

public class Switch_case1 {
    public static void main(String[] args) {


        int op,numero = 0;
        float valor = 0;

         Scanner entrada = new Scanner(System.in);
         
        System.out.println("\tCard�pio");
        System.out.println("\n 1 Picanha-----25,00  ");
        System.out.println("\n 2 Lasanha------20,00 ");
        System.out.println("\n 3 Strogonoff------18,00 ");
        System.out.println("\n 4 Bife Acebolado-------15,00");
        System.out.println("\n 5 P�o com ovo-------5,00 ");
        System.out.println("\n\n Digite o n�mero de sua op��o: ");
        

        op = entrada.nextInt();
        System.out.println("\n Voc� aceita pagar 10% de gorjeta para o gar�om? ");
        System.out.println("\nSe sim; digite 1 \nSe n�o; digite 2");
        numero = entrada.nextInt();

        switch(op) {
        case 1:
            System.out.println("\n1 Picanha-----25,00  ");
            valor = 25;
            if(numero == 1) {
                valor *= 1.1;
            }
            System.out.printf("\n Valor Final � %.2f " ,valor);
            break;
        case 2:
            System.out.println("\n 2 Lasanha------20,00 ");
            valor = 20;
            if(numero == 1) {
                valor *= 1.1;
            }
            System.out.printf("\n Valor Final � %.2f ",valor);
            break;
        case 3:
            System.out.println("\n 3 Strogonoff------18,00 ");
            valor = 18;
            if(numero == 1) {
                valor *= 1.1;
            }
            System.out.printf("\n Valor Final � %.2f ",valor);
            break;
        case 4:
            System.out.println("\n 4 Bife Acebolado-------15,00");
            valor = 15;
            if(numero == 1) {
                valor *= 1.1;
            }
            System.out.printf("\n Valor Final � %.2f ",valor);
            break;

        case 5:
            System.out.println("\n 5 P�o com ovo-------5,00 ");
            valor = 5;
            if(numero == 1) {
                valor *= 1.1;
            }
            System.out.printf("\n Valor Final � %.2f",valor);
            break;

        default:
            System.out.println("\n Op��o invalida: ");
        }
    }
}