package aula4_arrays_e_matrizes;

import java.util.Scanner;

public class matriz_Diagonais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[3][3];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite o valor da linha " + i + " e da coluna " + j + " - [" + i + "]" + "[" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElementos da Diagonal Principal: ");
		int sumDiagonalP = 0;
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			sumDiagonalP += mat[i][i];
		}
		System.out.println();
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		
		int sumDiagonalS = 0;
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][mat.length - 1 - i] + " "); // 2 - 0 = 2 / 2 - 1 = 1 2 - 2 = 0
			sumDiagonalS += mat[i][mat.length - 1 - i];
		}
		
		System.out.println();
		System.out.println("\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(sumDiagonalP);
		
		System.out.println("\nElementos da Diagonal Secundária:");
		System.out.println(sumDiagonalS);
		sc.close();

	}

}
