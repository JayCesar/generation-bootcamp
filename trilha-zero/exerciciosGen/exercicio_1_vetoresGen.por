programa
{
	
	funcao inicio()
	{
		inteiro vet[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
		inteiro aux = 0
		logico controle = verdadeiro

		escreva("\n")
		enquanto(controle){
			controle = falso
			para (inteiro i = 0; i < 10 - 1; i++){
				se (vet[i] < vet[i+1]){
					aux = vet[i]
					vet[i] = vet[i+1]
					vet[i+1] = aux
					controle = verdadeiro 
				}
			}
		}
		escreva("Valor ordenado: ")
		para (inteiro i = 0; i < 10; i++){
			escreva(vet[i], " ")
		}
		escreva("\n")
	}
}

 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 6, 10, 3}-{aux, 7, 10, 3}-{test, 9, 10, 4}-{test2, 10, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */