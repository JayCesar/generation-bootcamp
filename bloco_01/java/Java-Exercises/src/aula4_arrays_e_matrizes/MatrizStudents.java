package aula4_arrays_e_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrizStudents {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][] notas = {
				{4.0, 5.0, 7.0, 3.0},
				{2.5, 6.5, 4.7, 8.0},
				{10.0, 8.5, 9.5, 8.0},
				{9.0, 6.5, 7.6, 8.2},
				{5.0, 5.0, 5.0, 6.3},
				{7.0, 8.0, 9.0, 8.5},
				{5.5, 3.5, 2.5, 1.0},
				{8.0, 9.0, 10.0, 9.5},
				{5.6, 5.8, 6.5, 7.0},
				{7.5, 8.5, 9.5, 10.0},
		};
		
		double[] medias = new double[10];
		double sum = 0.0;
	
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				sum += notas[i][j];
			}
			medias[i] = sum / notas[0].length;
			sum = 0.0;
		}
		
		for (double media : medias) {
			System.out.println(String.format("%.1f", media) + " ");
		}
		sc.close();

	}

}
