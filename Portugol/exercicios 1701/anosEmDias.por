programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, diaAno
		
		escreva("Quantos anos você tem?: ")
		leia(ano)
		escreva("Quantos meses você tem?: ")
		leia(mes)
		escreva("Quantos dias você tem?: ")
		leia(dia)

		diaAno = ((ano * 365) + (mes * 30) + dia)
		
		escreva("\nVocê tem ", diaAno, " dias")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */