package Familia44;

public class For2 {

	public static void main(String[] args) {
		
		
		int n = 10, par = 0, impar = 0;		
		
		for(n = 0; n < 10; n++) {
						
			
			if(n % 2 == 0) {
				System.out.println("N�mero par: " + n);
				par++;
			}
			else {
				System.out.println("N�mero �mpar: " + n);
				impar++;
			}			
		}		
		System.out.println("\nPares: " + par);
		System.out.println("�mpares: " + impar);		
	}
}