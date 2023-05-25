package aula2;

import java.util.Locale;
import java.util.Scanner;

import aula2.entities.Employer;

public class ProgramEmployer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		String name = sc.nextLine();
		
		System.out.print("\nCargo: ");
		int codeId = sc.nextInt();
		
		System.out.print("\nSalário: R$ ");
		double income = sc.nextDouble();
		
		Employer emp = new Employer(name, codeId, income);
		
		System.out.println();
		
		switch(emp.getCode()) {
		case 1:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		case 2:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		case 3:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		case 4:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		case 5:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		case 6:
			System.out.println("Nome do colaborador: " + emp.getNameEmpoyer());
			System.out.println("\nCargo: " + emp.getJobTittle());
			System.out.printf("\nSalário: R$ " + String.format("%.2f", emp.netIncome()));
			break;
		default:
			System.out.println("O código fornecido não é reconhecido no sistema, tente novamente");
		}
		

		sc.close();

	}

}
