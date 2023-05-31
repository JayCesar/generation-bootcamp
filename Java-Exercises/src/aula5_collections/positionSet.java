package aula5_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class positionSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer inputNumber = null, localNumber = null;
		
		Set<Integer> listNumbers = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("\nDigite o " + (i+1) + "° número: ");
			inputNumber = sc.nextInt();
			while(inputNumber == localNumber) {
				System.out.println("\nNúmero " + inputNumber + " digitado anteriormente.");
				System.out.print("Por favor, digite outro número: ");
				inputNumber = sc.nextInt();
			}
			listNumbers.add(inputNumber);
			localNumber = inputNumber;
		}
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		int findNumber = sc.nextInt();
		
		if (listNumbers.contains(findNumber)) {
			System.out.println("\nO número " + findNumber + " foi encontrado!");
		}else {
			System.out.println("\nO número " + findNumber + " não foi encontrado!");
		}
		
	}

}
