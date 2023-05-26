package aula3;

import java.util.Locale;
import java.util.Scanner;

//link to exercise: https://docs.google.com/document/d/1MtGrmQGe84qvJrvHT4Avu1K_ij209xAc/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true


public class doWhile_Ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int sumPositiveNumbers = 0;
		boolean stop = false;
		
		do {
			System.out.print("Digite um número: ");
			int number = sc.nextInt();
			sumPositiveNumbers += (number >= 0) ? number : 0;
			if (number == 0) stop = !stop;
		}while(!stop);
		
		System.out.println("\nA soma dos números positivos é: " + sumPositiveNumbers);
	
	}

}
