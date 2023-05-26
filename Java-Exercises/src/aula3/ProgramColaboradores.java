package aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula3.entities.Colaborador;

//link to exercise: https://docs.google.com/document/d/1MtGrmQGe84qvJrvHT4Avu1K_ij209xAc/edit?usp=sharing&ouid=112690016069965069438&rtpof=true&sd=true
public class ProgramColaboradores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Colaborador> colaboradores = new ArrayList<>();

		boolean control = true;
		
		while (control) {
			System.out.print("Digite a Idade: ");
			int age = sc.nextInt();
			System.out.print("\nDigite o Sexo: ");
			int sex = sc.nextInt();
			System.out.print("\nDigite a Categoria: ");
			int category = sc.nextInt();

			Colaborador c = new Colaborador(age, sex, category);
			colaboradores.add(c);
			
			System.out.print("\nDeseja continuar(S/N): ");
			char input = Character.toUpperCase(sc.next().charAt(0));
			if (input == 'N') {
				c.totalBackEndDev(colaboradores);
				control = false;
			}else {
				System.out.println();
			}
			
			while (input != 'N' && input != 'S') {
				System.out.println("Opção inválida!");
				System.out.print("Deseja continuar(S/N): ");
				input = Character.toUpperCase(sc.next().charAt(0));
				if (input == 'N') {
					control = false;
				}else {
					System.out.println();
				}
					
			}
		}
		
		// Total
		int totalBackEndDev = 0, totalWomenFrontDevs = 0, totalMobileMenOver40 = 0, totalMobileWomenOver30 = 0;
		
		for (Colaborador c : colaboradores) {
			totalBackEndDev = c.totalBackEndDev(colaboradores);
			totalWomenFrontDevs = c.totalWomenFrontDevs(colaboradores);
			totalMobileMenOver40 = c.totalMobileMenOver40(colaboradores);
			totalMobileWomenOver30 = c.totalMobileWomenOver30(colaboradores);
		}
		
		System.out.println("\nTotal de pessoas desenvolvedors Backend: " + totalBackEndDev);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + totalWomenFrontDevs);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + totalMobileMenOver40);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + totalMobileWomenOver30);
		
	
		
		sc.close();

	}

}
