package POO44;

import java.util.Scanner;

public class Funcionario {

	private int horaExtra;

	double valorHora;
	
	Scanner leia = new Scanner(System.in);
	
	private String nome;
	private int salario, VA, VR;
	
	public Funcionario(String nome, int salario, int VA, int VR) {
		this.nome = nome;
		this.salario = salario;
		this.VA = VA;
		this.VR = VR;
	} 
	
	public void imprimirInfo() {
		System.out.println("Nome: "+nome+"\nSalário: RS"+salario+"\nValor do VA: RS"
							+VA+"\nValor do VR: RS"+VR);
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getVA() {
		return VA;
	}

	public void setVA(int vA) {
		VA = vA;
	}

	public int getVR() {
		return VR;
	}

	public void setVR(int vR) {
		VR = vR;
	}
	
	public double totalH(int horaExtra) {
		System.out.println("\nEntre com as horas extras trabalhadas: ");
		horaExtra = leia.nextInt();
		valorHora = horaExtra * 22.5;
		return horaExtra;
		}
	
	public void bonus() {
		System.out.println("\n\nSeu bônus salarial é de: RS"+this.valorHora);
	}
}
