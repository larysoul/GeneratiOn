programa
{
	
	funcao inicio()
	{
	inteiro vetor[5], soma = 0, media, maiorPont = 0, cont = 0

	para(inteiro rol=0; rol<5; rol++) {
		escreva("Qual o valor do dado? ")
		leia(vetor[rol])
		soma+=vetor[rol]

			se(vetor[rol] >= maiorPont) {
				se(vetor[rol] == maiorPont) {
					cont++
				} senao {
					cont = 0
					cont++
				}
				maiorPont = vetor[rol]
			}
		} limpa()
			media = soma / 5
				escreva("A média de lançamentos foi de: " + media)
				escreva("\nO número " + maiorPont + " se repetiu " + cont + "x")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */