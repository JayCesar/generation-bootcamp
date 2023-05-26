package aula3;

import java.util.Locale;
import java.util.Scanner;

public class ExIntervaloEMultiploesDe3e5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int n2 = sc.nextInt();
		
		if (n2 <= n1) {
			System.out.println("Intervalo inválido!");
		}
		else {
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
		
		sc.close();

	}

}
