package aula4_arrays_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class ProcuraNumeroNoArray {
	// Link to docs: https://docs.google.com/document/d/1zfhMA7WgBlEL5buZJvUcpivQS-SFQzZ4/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrayNumbers[] = new int[10]; // ou int[] arrayNumbers = new int[10]; 
		
		for(int i = 0; i < arrayNumbers.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			arrayNumbers[i] = sc.nextInt();
		}
		
		// Ordenando o vetor de foram crescenr
		// (Preciso primeiro ordernar para buscar um número)
		Arrays.sort(arrayNumbers);
		
		// Usuário digita o número que busca encontrar
		System.out.print("Digite o número que você deseja encontrar: ");
		int number = sc.nextInt();
		
		// Procura a posição do número desejado / digitado
		int position = Arrays.binarySearch(arrayNumbers, number);
		
		if (position >= 0) {
			System.out.println("\nO número " + number + " está localizado na posição: " + position);
		}else {
			System.out.println("\nO número " + number + " não foi encontrado!");
			System.out.println("\n Position: " + position);
		}

	}

}
