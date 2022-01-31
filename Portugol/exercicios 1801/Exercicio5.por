programa
{
	
	funcao inicio()
	{
		real indiceP

		escreva("Insira o número do índice de poluição atual: ")
		leia(indiceP)

		se (indiceP >= 0.05 e indiceP <= 0.25) {
		   escreva("O índice de poluição está aceitavél.") 
		} senao se (indiceP >= 0.3 e indiceP < 0.4){
			escreva("As atividades do primeiro grupo serão suspensas!")
		} senao se (indiceP >= 0.4 e indiceP <= 0.5) {
			escreva("As atividades do primeiro e segundo grupo serão suspensas!")
		} senao se (indiceP > 0.5) {
			escreva("As atividades de todos os grupos serão suspensas") 
		} senao {
			escreva("O índice não é classificavél!") 
		}
	}
			
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */