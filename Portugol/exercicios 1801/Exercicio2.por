programa
{
	
	funcao inicio()
	{
	real N, E, salarioTotal, salarioE
	cadeia C
	
	escreva("Qual o nome do funcionário? ")
	leia(C)
	escreva("Quantas horas o funcionário trabalhou? ")
	leia(N)

	se (N > 50) {
		E = N - 50
		salarioE = (E * 20.0)
		salarioTotal = (50 * 10.0) + salarioE
		escreva("O salario excedente é de RS" + salarioE + 
		"\nO salario total é de RS" + salarioTotal)
		
	} senao se (N <= 50 e N > 0) {
		salarioTotal = N * 10
		escreva("O salário total é de RS" + salarioTotal)
		
	} senao se (N <= 0) {
		escreva("Não houve horas trabalhadas")
		
	}
	
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */