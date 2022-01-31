programa
{
	
	funcao inicio()
	{
	
		real num = 0.0, totalSoma = 0.0
		inteiro cont = 0
			
		enquanto (num >= 0) {
			escreva("Informe um número: ")
			totalSoma = num + totalSoma
			leia(num)		
			cont++	}
	limpa()
	
		escreva("A média de valores é de: "+(totalSoma/cont))
		escreva("\nO total do somatório é de: "+totalSoma) //(totalsoma - num) outro jeito
		escreva("\nO total de valores positivos lidos: "+(cont-1))
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */