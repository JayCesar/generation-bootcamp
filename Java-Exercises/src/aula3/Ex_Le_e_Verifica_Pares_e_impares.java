package aula3;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Le_e_Verifica_Pares_e_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int totalEven = 0;
		int totalOdd = 0;
	
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
