programa
{
	
	funcao inicio()
	{
	
	inteiro num = 1, somaNum = 0

	para(num = 1; num <=500; num++) {
		se(num%2 != 0){
			se(num%3 == 0) {
				somaNum = somaNum + num	
		}
	  }
	} 
	escreva("A somatória dos números impáres e multiplos de 3 entre 1 a 500 é de: " + somaNum)
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 254; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */