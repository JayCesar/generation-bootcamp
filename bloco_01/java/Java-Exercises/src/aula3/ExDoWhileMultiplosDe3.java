package aula3;

import java.util.Locale;
import java.util.Scanner;

public class ExDoWhileMultiplosDe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		boolean stop = false;
		double amountNumbers = 0, sumNumbers = 0;
		double average = 0;
		
		do {
			System.out.print("Digite um número: ");
			int inputNumber = sc.nextInt();
			if (inputNumber == 0) {
				stop = !stop;
			}else if(inputNumber % 3 == 0) {
				sumNumbers += inputNumber;
				amountNumbers++;
			}
		} while(!stop);
		
		average = sumNumbers / amountNumbers;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: " +  String.format("%.1f", average));
		
		sc.close();

	}

}
