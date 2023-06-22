package aula3;

import java.util.Locale;
import java.util.Scanner;

// link to exercise: https://docs.google.com/document/d/1MtGrmQGe84qvJrvHT4Avu1K_ij209xAc/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true
public class CalculateAmountOfAgeOfPeople {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int number = 0, under21Years = 0, over50years = 0;
		
		while(number>=0) {
			System.out.print("Digite uma idade: ");
			number = sc.nextInt();
			under21Years += (number < 21 && number > 0) ? 1 : 0;
			over50years += (number > 50) ? 1 : 0;
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + under21Years);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + over50years);
		
		sc.close();

	}

}
