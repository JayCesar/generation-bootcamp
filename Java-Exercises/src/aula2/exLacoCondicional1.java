package aula2;

import java.util.Locale;
import java.util.Scanner;

public class exLacoCondicional1 {
	
	/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
	* imprima na tela se a soma de A + B é maior, menor ou igual a C.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String letters[] = {"A", "B", "C"};
		int numbers[] = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite o número " + letters[i] + ": ");
			numbers[i] = sc.nextInt();
		}
		
		if (numbers[0] + numbers[1] > numbers[2]) {
			System.out.println();
			System.out.println(numbers[1] + " + " + numbers[0] + " = " + (numbers[0] + numbers[1]) + " > " +  numbers[2] + "\n");
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(numbers[0] + numbers[1] < numbers[2]) {
			System.out.println();
			System.out.println(numbers[1] + " + " + numbers[0] + " = " + (numbers[0] + numbers[1]) + " < " +  numbers[2] + "\n");
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.println();
			System.out.println(numbers[1] + " + " + numbers[0] + " = " + (numbers[0] + numbers[1]) + " = " +  numbers[2] + "\n");
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		sc.close();
	}
}
