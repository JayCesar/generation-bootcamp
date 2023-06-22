package aula2;

import java.util.Locale;
import java.util.Scanner;

import aula2.entities.NumberTyped;

public class ProgramQuantroOperacoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o 1º número: ");
		Double n1 = sc.nextDouble();
		System.out.print("\nDigite o 2º número: ");
		Double n2 = sc.nextDouble();
		System.out.print("\nOperação: ");
		int inputType = sc.nextInt();
		
		NumberTyped number = new NumberTyped(n1, n2);
		
		System.out.println();
		
		System.out.println(number.getN1() 
				+ " " + number.verifySymbol(inputType) 
				+ " " + number.getN2() + 
				" = " + String.format("%.1f", number.OperatorService(inputType)));
		sc.close();
	}

}
