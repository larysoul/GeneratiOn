programa
{
	
	funcao inicio()
	{
		real matriz[3][3], somaTotal=0.0, somaDiag=0.0

		para(inteiro linha=0; linha<3; linha++) {
			para(inteiro coluna=0; coluna<3; coluna++) {
				escreva("Informe um número: ")
				leia(matriz[linha][coluna])
				somaTotal+=matriz[linha][coluna]

				se(linha==coluna){
					somaDiag+=matriz[linha][coluna]
				} limpa()
			}
		} escreva("A soma total é de " + somaTotal)
		escreva("\nA soma da diagonal principal é de " + somaDiag)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 7, 6}-{somaTotal, 6, 21, 9}-{somaDiag, 6, 36, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */