package ProjetoONGs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjetoONG {

	public static int TratamentoErro(int idade, int codigo) throws ArithmeticException {
		return 0;
	}

	public static int TratamentoErro1(int op) throws ArithmeticException {
		return 0;
	}

	public static void main(String[] args) {

		int op = 0, num = 0;
		float ver, ver2, total = 1000;
		String nome1, cpf1;
		int idade1, codigo1;

		try (Scanner entrada = new Scanner(System.in)) {

			Voluntario vol2 = new Voluntario("", "", 0, 0);
			ONGs ong2 = new ONGs("", "", 0, 0);
			Parceiro par2 = new Parceiro("", "", 0, 0);
			Verba ve = new Verba("", "", 0, 0, 0);
			Verba ve2 = new Verba("", "", 0, 0, 0);

			do {

				boolean continueLoop1 = true;

				do {

					try {

						System.out.println("\n\n\t   Menu de Opções... ");
						System.out.println("\n -- Cadastrar novo voluntario -- digite 1");
						System.out.println("\n -- Cadastrar nova     Ong    -- digite 2");
						System.out.println("\n -- Cadastrar novo   Parceiro  -- digite 3");
						System.out.println("\n -- Entrada e Saída de Verbas -- digite 4");
						System.out.println("\n --    Imprimir Informações  -- digite 5");
						System.out.println("\n      -- DIGITE 0 PARA FINALIZAR  --");
						op = entrada.nextInt();

						switch (op) {

						case 1:
							boolean continueLoop = true;
							do {
								try {
									System.out.println("\n --Cadastrar novo voluntario -- digite 1");

									System.out.println("\n Digite o nome: ");
									nome1 = entrada.next();
									System.out.println("\n Digite o CPF: ");
									cpf1 = entrada.next();
									System.out.println("\n Digite a Idade: ");
									idade1 = entrada.nextInt();
									System.out.println("\n Digite o código: ");
									codigo1 = entrada.nextInt();

									continueLoop = false;

									Voluntario vol = new Voluntario(nome1, cpf1, idade1, codigo1);
									vol2 = vol;
									vol.imprimirVoluntario();
								} catch (InputMismatchException inputMismatchExceptio) {

									entrada.nextLine();
									System.err.println("\n\t   Opção inválida ");
									System.out.println("");
									System.out.println("\n     Por favor tente novamente...");
								}
							} while (continueLoop);
							break;

						case 2:
							boolean continueLoo = true;
							do {

								try {
									System.out.println("\n --Cadastrar nova     Ong    -- digite 2");

									System.out.println("\n Digite o nome: ");
									nome1 = entrada.next();
									System.out.println("\n Digite o CPF: ");
									cpf1 = entrada.next();
									System.out.println("\n Digite a Idade: ");
									idade1 = entrada.nextInt();
									System.out.println("\n Digite o código: ");
									codigo1 = entrada.nextInt();

									continueLoo = false;

									ONGs ong = new ONGs(nome1, cpf1, idade1, codigo1);

									ong2 = ong;

									ong.imprimirOng();
								} catch (InputMismatchException inputMismatchExceptio) {

									entrada.nextLine();
									System.err.println("\n\t   Opção inválida ");
									System.out.println("");
									System.out.println("\n     Por favor tente novamente...");
								}

							} while (continueLoo);
							break;
						case 3:
							boolean continueLo = true;
							do {

								try {
									System.out.println("\n --Cadastrar novo   Parceiro  -- digite 3");

									System.out.println("\n Digite o nome: ");
									nome1 = entrada.next();
									System.out.println("\n Digite o CPF: ");
									cpf1 = entrada.next();
									System.out.println("\n Digite a Idade: ");
									idade1 = entrada.nextInt();
									System.out.println("\n Digite o código: ");
									codigo1 = entrada.nextInt();

									Parceiro par = new Parceiro(nome1, cpf1, idade1, codigo1);
									;
									par2 = par;

									continueLo = false;

									par.imprimirParceiro();

								} catch (InputMismatchException inputMismatchException) {

									entrada.nextLine();
									System.err.println("\n\t   Opção inválida ");
									System.out.println("");
									System.out.println("\n     Por favor tente novamente...");
								}

							} while (continueLo);
							break;
						case 4:
							boolean continueL = true;
							do {

								try {
									System.out.println("\n --Entrada e Saida de Verbas -- digite 4");
									System.out.println("\n Digite 0 para entrada \n \t ou \n Digite 1 para saída");
									num = entrada.nextInt();

									if (num == 0) {

										System.out.println("\n Digite o nome: ");
										nome1 = entrada.next();
										System.out.println("\n Digite o CPF: ");
										cpf1 = entrada.next();
										System.out.println("\n Digite a Idade: ");
										idade1 = entrada.nextInt();
										System.out.println("\n Digite o código: ");
										codigo1 = entrada.nextInt();
										System.out.println("\n Digite o valor da Verba: ");
										ver = entrada.nextInt();

										Verba verba = new Verba(nome1, cpf1, idade1, codigo1, ver);
										ve = verba;

										total = total + ver;

										verba.imprimirVerba();
										System.out.println("\n Valor Total do em Caixa : R$" + total);

									} else if (num == 1) {

										System.out.println("\n Digite o nome: ");
										nome1 = entrada.next();
										System.out.println("\n Digite o CPF: ");
										cpf1 = entrada.next();
										System.out.println("\n Digite a Idade: ");
										idade1 = entrada.nextInt();
										System.out.println("\n Digite o código: ");
										codigo1 = entrada.nextInt();
										System.out.println("\n Digite o valor da Verba: ");
										ver2 = entrada.nextInt();

										Verba verba2 = new Verba(nome1, cpf1, idade1, codigo1, ver2);
										ve2 = verba2;

										total -= ver2;

										verba2.imprimirVerba2();
										System.out.println("\n Valor Total do em Caixa : R$" + total);

									} else {
										System.out.println("\n Opção inválida...");
										System.out.println("\n Por favor tente novamente...");
									}
									continueL = false;

								} catch (InputMismatchException inputMismatchExceptio) {

									entrada.nextLine();
									System.err.println("\n\t   Opção inválida ");
									System.out.println("");
									System.out.println("\n     Por favor tente novamente...");
								}

							} while (continueL);
							break;
						case 5:
							System.out.println("\n --Imprimir Informações      -- digite 5");

							System.out.println("\n voluntario ");
							vol2.imprimirVoluntario();

							System.out.println("\n  Ong  ");
							ong2.imprimirOng();

							System.out.println("\n Parceiro");
							par2.imprimirParceiro();

							System.out.println("\n Verba de Entrada... ");
							ve.imprimirVerba();

							System.out.println("\n Verba de Saída... ");
							ve2.imprimirVerba2();

							System.out.println("\n Valor total em caixa é : R$" + total);

							break;
						default:
							if (op != 0) {
								System.err.println("\n \tOpção Inválida...");
								System.out.println("\n Por favor tente novamente...");
							}
						}

						continueLoop1 = false;

					} catch (InputMismatchException inputMismatchExceptio) {

						entrada.nextLine();
						System.err.println("\n\t   Opção inválida ");
						System.out.println("");
						System.out.println("\n     Por favor tente novamente...");
					}

				} while (continueLoop1);

			} while (op != 0);
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}

		System.out.println("\n Fim do Programa...");
		System.out.println("\n Obrigado por utilizar o Programa...");
	}
}