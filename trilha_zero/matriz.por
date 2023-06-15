programa
{
	
	funcao inicio()
	{
		inteiro vet[4]={1,2,3,4}
		inteiro notas[4][4]= {{2,5,6,9},
						  {2,5,6,9},
						  {2,5,6,9},
						  {2,5,6,9}}

		para (inteiro l=0; l <4; l++){
			para (inteiro c =0; c < 4; c++){
				escreva(notas[l][c], ",")	
			}
			escreva("\n")
		}
	
		escreva("\n")
		inteiro matriz[2][2]
		
		para (inteiro l=0; l <2; l++){
		
			para (inteiro c =0; c < 2; c++){
				escreva("Digite um número: ")
				leia(matriz[l][c])	
			}
			
		} 

		para (inteiro l=0; l <2; l++){
			para (inteiro c =0; c < 2; c++){
				escreva(matriz[l][c], ",")	
			}
			escreva("\n")
		}
					
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 7, 10, 5}-{c, 13, 17, 1}-{c, 23, 17, 1}-{c, 31, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */