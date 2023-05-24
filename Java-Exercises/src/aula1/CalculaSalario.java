package aula1;

import java.util.Locale;
import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		
		// settings
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// variables
		float income;
		float allowance;
		float newIncome;
		
		System.out.println("Digite o salário: ");
		income = sc.nextFloat();
		System.out.println("Digite o Abono: ");
		allowance = sc.nextFloat();
		
		newIncome = income + allowance;
		
		System.out.printf("Salário: %.2f", newIncome);
		
		sc.close();

	}

}
