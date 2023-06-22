package aula1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		float grossSalary = sc.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		float additionalNight = sc.nextFloat();
		
		System.out.print("Horas extras: ");
		float extraHours = sc.nextFloat();
		
		System.out.print("Descontos: ");
		float discount = sc.nextFloat();
		
		Employer emp1 = new Employer(grossSalary, additionalNight, extraHours, discount);
		
		System.out.println();
		
		System.out.printf("Salário líquido: " + String.format("%.2f", emp1.netIncome()));
		
		sc.close();
	}

}
