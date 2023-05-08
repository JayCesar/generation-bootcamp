programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro vet[10]
		inteiro soma = 0
		inteiro media = 0
		
		para (inteiro i = 0; i < 10; i++){
			leia(vet[i])	
			soma+= vet[i]
		}
		limpa()
		
		media = soma / 10

		escreva("Elementos nos índices ímpares: \n")
		para (inteiro i = 1; i < 10; i+=2){
			escreva(vet[i], " ")
		}
		
		escreva("\n")
		escreva("\nElementos pares: \n")
		para (inteiro i = 0; i < 10; i++){
			se (vet[i] % 2 == 0 e vet[i] != 0){
				escreva(vet[i], " ")
			}
		}

		escreva("\n")
		escreva("\nSoma: \n")
		escreva(soma, "\n")
		escreva("\nMedia: \n")
		escreva(media)


		/*para (inteiro i = 0; i < 10 - 1; i++){
			nIndImpar[i] = vet[i + 1]
		}*/
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */