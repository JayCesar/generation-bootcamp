package aula2;

import java.util.Locale;
import java.util.Scanner;

public class tabelaCargoSwitch {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do produto: ");
		int code = sc.nextInt();
		System.out.print("\nQuantidade: ");
		int quantity = sc.nextInt();
		
		switch(code){
		case 1:
			System.out.println("\nProduto: Cachorro Quente\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 10.0));
			break;
		case 2:
			System.out.println("\nProduto: X-Salada\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 15.0));
			break;
		case 3:
			System.out.println("\nProduto: X-Bacon\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 18.0));
			break;
		case 4:
			System.out.println("\nProduto: Bauru\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 12.0));
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 8.0));
			break;
		case 6:
			System.out.println("\nProduto: Suco de laranja\n");
			System.out.printf("Valor total R$ " + String.format("%.2f", quantity * 13.0));
			break;
		default:
			System.out.println("Código não reconhecido!");
		}
		
		sc.close();

	}

}
