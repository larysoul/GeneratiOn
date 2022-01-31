programa
{
	
	funcao inicio()
	{

	real vetor[5], maiorValor = 0.0

	para(inteiro per = 0; per < 5; per++) {
		escreva("Informe um valor: ")
		leia(vetor[per])
		escreva(vetor[per] + "\n")

		se(maiorValor < vetor[per]) {
			maiorValor = vetor[per]	
			}
		} escreva("\nO maior valor foi: " + maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */