package aula2;

import java.util.Locale;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// initial value;
		float balance = 1000.00f;

		System.out.print("Operação: ");
		int accountAction = sc.nextInt();

		switch (accountAction) {
		case 1:
			System.out.println("Operação - Saldo\n");
			System.out.println("Saldo: " + String.format("%.2f", balance));
			break;
		case 2:
			System.out.print("Valor: R$ ");
			double withdraw = sc.nextDouble();
			System.out.println("Operação - Saque\n");
			if (withdraw > balance) {
				System.out.println("Saldo Insuficiente!");
			} else {
				System.out.println("Novo saldo: " + String.format("%.2f", (balance - withdraw)));
			}
			break;
		case 3:
			System.out.print("Valor: R$ ");
			double deposit = sc.nextDouble();
			System.out.println("Operação - Depósito\n");
			System.out.println("Novo saldo: " + String.format("%.2f", (balance + deposit)));
			break;
		default:
			System.out.println("Operação Inválida!");
		}

		sc.close();

	}

}
