package POO44;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Scar", "scarlindo@gmail.com",
				"490.402.028-13", "(11)99468-7398", 25);
		
			cliente1.imprimirInfo();
			cliente1.reembolso();
	}
}
