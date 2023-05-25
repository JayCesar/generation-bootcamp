package aula2;

import java.util.Locale;
import java.util.Scanner;

public class exLacoCondicional2 {

	/*
	 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre
	 * na tela uma mensagem indicando se este número é par ou ímpar e se o número é
	 * positivo ou negativo.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("Digite um número: ");
			int input = sc.nextInt();

			switch (verifyCondiction(input)) {
			case "par e positivo":
				System.out.println("O Número " + input + " é par e positivo!");
				break;
			case "par e negativo":
				System.out.println("O Número " + input + " é par e negativo!");
				break;
			case "impar e positivo":
				System.out.println("O Número " + input + " é ímpar e positivo!");
				break;
			case "impar e negativo":
				System.out.println("O Número " + input + " é ímpar e negativo!");
				break;
			default:
				System.out.println("Verifique se você digitou o número corretamente");
			}
			System.out.println();
		}

		sc.close();
	}

	// function that verifies condition of input
	public static String verifyCondiction(int input) {
		if (input % 2 == 0 && input > 0) {
			return "par e positivo";
		} else if (input % 2 == 0 && input < 0) {
			return "par e negativo";
		} else if (input % 2 != 0 && input > 0) {
			return "impar e positivo";
		} else if (input % 2 != 0 && input < 0) {
			return "impar e negativo";
		}
		return null;
	}
}
