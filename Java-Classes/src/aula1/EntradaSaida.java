package aula1;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		Scanner read = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));
		
		String name;
		float distance;
		
		System.out.println("What is your name?");
		name = scanner.nextLine();
		
		System.out.println("How long did you run?");
		distance = scanner.nextFloat();
	
		
		
	}
	


}

