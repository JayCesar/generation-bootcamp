package aula3;

import java.util.Locale;
import java.util.Scanner;

// link to exercise: https://docs.google.com/document/d/1MtGrmQGe84qvJrvHT4Avu1K_ij209xAc/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true

public class Ex_Le_e_Verifica_Pares_e_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int totalEven = 0, totalOdd = 0;
	
		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "º número: ");
			int inputNumber = sc.nextInt();
			totalEven += (inputNumber % 2 == 0) ? 1 : 0;
			totalOdd += (inputNumber % 2 != 0) ? 1 : 0;
		}
		
		System.out.println("\nTotal de números pares: " + totalEven);
		System.out.println("\nTotal de números ímpares: " + totalOdd);
		
		
		sc.close();

	}

}
