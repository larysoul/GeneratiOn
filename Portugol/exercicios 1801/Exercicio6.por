programa
{
	
	funcao inicio()
	{

	inteiro idade
	
	escreva("Qual a idade do atlete? ")
	leia(idade)

	se (idade >= 5 e idade <= 7) {
		escreva("\nA categoria do atlete é Infantil A")
	} senao se (idade >= 8 e idade <= 11) {
		escreva("\nA categoria do atlete é Infantil B")
	} senao se (idade >= 12 e idade <= 13) {
		escreva("\nA categoria do atlete é Juvenil A")
	} senao se (idade >= 14 e idade <= 17) {
		escreva("\nA categoria do atlete é Juvenil B")
	} senao se (idade >= 18) {
		escreva("\nA categoria do atlete é Adultos")
	} senao {
		escreva("\nNão existe categoria para esta idade")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */