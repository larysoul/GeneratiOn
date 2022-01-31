programa
{
	
	funcao inicio()
	{

	real base, altura, area
	
		escreva("Informe o tamanho da base: ")
		leia(base)
		escreva("Informe o tamanho da altura: ")
		leia(altura)

		se (base > 0 e altura > 0) {
			area = (base * altura) / 2
			escreva("\nA área do triângulo é de " + area)
		} senao {
			escreva("\nOs números informados são iválidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 255; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */