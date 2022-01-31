programa
{
	
	funcao inicio()
	{

	real populacao, salario, salarioTotal = 0.0, numFilho, numFilhoTotal = 0.0, mediaSal = 0.0, 
	mediaFilho, maiorSal = 0.0, percentual =  0.0, percentualP100 = 0.0, numHab

	numHab = 20.0
	
		para(populacao = 1.0; populacao <= numHab; populacao++) {
			escreva("Quanto você recebe de salário? ")
			leia(salario)
			escreva("Quantos filhos você tem? ")
			leia(numFilho)

			salarioTotal = salarioTotal + salario
			numFilhoTotal = numFilhoTotal + numFilho

			se(salario > maiorSal) {
				maiorSal = salario 
			}

			se(salario <= 100) {
				percentualP100++
			} 
		}

		mediaSal = salarioTotal / numHab
		mediaFilho = numFilhoTotal / numHab
		percentual = percentualP100 / numHab * 100
	limpa()
		escreva("A média de salário é de: RS" + mediaSal)
		escreva("\nA média de filhos é de: " + mediaFilho)
		escreva("\nO maior salário é de: RS" + maiorSal)
		escreva("\nO percentual de pessoas com salário até RS100,00 é de: " + percentual + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */