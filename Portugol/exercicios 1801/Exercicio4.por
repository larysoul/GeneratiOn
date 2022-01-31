programa
{
	
	funcao inicio()
	{
		inteiro num

		escreva("\nInsira um número: ")
		leia(num)

		se(num % 2 == 0)
		{
			se(num>0)
			{
				escreva("\nPar e Postivo")
			}
			senao se (num<0)
			{
				escreva("\nPar e Negativo")
			}
			senao
			{
				escreva("\nPar e Neutro")
			}
		}
		senao
		{
			se(num>0)
			{
				escreva("\nÍmpar e Postivo")
			}
			senao se (num<0)
			{
				escreva("\nÍmpar e Negativo")
			}
			senao
			{
				escreva("\nÍmpar e Neutro")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */