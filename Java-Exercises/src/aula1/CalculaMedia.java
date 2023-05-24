package aula1;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//variables
		float notas[] = new float[4];
		float sum = 0;
		float averege = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Nota " + (i+1) + ": ");
			notas[i] = sc.nextFloat();
			System.out.println();
			sum += notas[i];
		}
		
		averege = sum / notas.length;
		
		System.out.printf("Média final: %.1f", averege);
		

	}

}
