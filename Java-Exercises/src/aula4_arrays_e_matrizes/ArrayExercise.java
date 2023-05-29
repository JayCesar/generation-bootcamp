package aula4_arrays_e_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ArrayExercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] arrayNumbers = new int[10];
		int sum = 0;
		double media = 0.0;
	
		for(int i = 0; i < arrayNumbers.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			arrayNumbers[i] = sc.nextInt();
			sum += arrayNumbers[i];
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < arrayNumbers.length; i++) 
			if (i % 2 != 0) System.out.print(arrayNumbers[i] + " ");
			
		System.out.println("\n\nElementos pares:");
		for (int number : arrayNumbers) 
			if (number % 2 == 0) System.out.print(number + " ");
		
		media = (double) sum / 10;
		
		System.out.print("\n\nSoma: " + sum);
		System.out.print("\n\nMédia: " + String.format("%.2f", media));

		sc.close();

	}

}
