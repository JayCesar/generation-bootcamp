programa
{
	// Considerando uma lista de números [-1, 3, 4, 2, 6], desenvolva um algoritmo que seja capaz de identificar o menor número.
	funcao inicio()
	{
		inteiro n1 = -1
		inteiro n2 = 3
		inteiro n3 = 4
		inteiro n4 = 2
		inteiro n5 = 6
		inteiro menor_numero = 0
	
		se (n1 < n2 e n1 < n3 e n1 < n4 e n1 < n5){
			menor_numero = n1
		} 
		senao se(n2 < n1 e n2 < n3 e n2 < n4 e n2 < n5){
			menor_numero = n2
		} 
		senao se(n3 < n1 e n3 < n2 e n3 < n4 e n3 < n5){
			menor_numero = n3
		}
		senao se(n4 < n1 e n4 < n2 e n4 < n3 e n4 < n5){
			menor_numero = n4
		}
		senao se(n5 < n1 e n5 < n2 e n5 < n3 e n5 < n4){
			menor_numero = n5
		}
		escreva("O menor número é ", menor_numero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */