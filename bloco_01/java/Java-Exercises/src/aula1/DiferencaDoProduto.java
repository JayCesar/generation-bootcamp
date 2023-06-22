package aula1;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaDoProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variables
		float numbers[] = new float[4], difference;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("numero" + (i+1) + ": ");
			numbers[i] = sc.nextFloat();
			System.out.println();
		}
		
		difference = (numbers[0] * numbers[1]) - (numbers[2] * numbers[3]);
		
		System.out.printf("Diferença: %.1f%n%n", difference);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("numero" + (i+1) + ": ");
			numbers[i] = sc.nextFloat();
			System.out.println();
		}
		
		difference = (numbers[0] * numbers[1]) - (numbers[2] * numbers[3]);
		
		System.out.printf("Diferença: %.1f", difference);

	}

}
