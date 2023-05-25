package aula2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula2.entities.Donor;

public class ProgramDonatingBlood {
	/*
	 * Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com
	 * idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
	 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador
	 * (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De
	 * acordo com as Regras para a doação, mostre na tela se o doador está Apto ou
	 * Não Apto para doar sangue. Veja os exemplos abaixo:
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Donor> donorsList = new ArrayList<>();

		// input
		System.out.print("Quantas pessoas irão doar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("\nDigite o Nome do(a) " + i + "º doador(a): ");
			String name = sc.nextLine();

			System.out.print("\nDigite a Idade do(a) " + i + "º doador(a): ");
			int age = sc.nextInt();

			sc.nextLine();

			System.out.print("\nDoador(a) " + name + ", é a sua primeira doação de sangue? ");
			String status = sc.nextLine();
			
			Donor dr = new Donor(name, age, Boolean.parseBoolean(status));
			donorsList.add(dr);
		}
		
		System.out.println();
		
		Iterator<Donor> iterator = donorsList.iterator();
		
		while (iterator.hasNext()) {
		    Donor d = iterator.next();
		    if (d.getAge() >= 60 && d.getAge() <= 69) {
		        if (d.verifyFirstTime(d.getDonorStatus())) {
		            System.out.println(d.getName() + " não está apto para doar sangue!\n");
		            iterator.remove();
		        } else {
		            System.out.println(d.getName() + " está apto(a) para doar sangue!\n");
		        }
		    } else if (d.getAge() >= 18 && d.getAge() < 60) {
		        System.out.println(d.getName() + " está apto(a) para doar sangue!\n");
		    } else {
		        System.out.println(d.getName() + " não está apto para doar sangue!\n");
		        iterator.remove();
		    }
		}
		
		/*for (Donor d : donorsList) {
			if(d.getAge() >= 60 && d.getAge() <= 69) {
				if (d.verifyFirstTime(d.getDonorStatus())) {
					System.out.println(d.getName() + " não está apto para doar sangue!");
					donorsList.remove(d);
				}else {
					System.out.println(d.getName() + " está apto(a) para doar sangue!");
				}
			}
			else if(d.getAge() >= 18 && d.getAge() < 60) {
				System.out.println(d.getName() + " está apto(a) para doar sangue!");
			}
			else {
				System.out.println(d.getName() + " não está apto para doar sangue!");
				donorsList.remove(d);
			}
			
		}*/
		


		/*if(donor.getAge() >= 60 && donor.getAge() <= 69) {
			if (donor.verifyFirstTime(donor.getDonorStatus())) {
				System.out.println(donor.getName() + " não está apto para doar sangue!");
			}else {
				System.out.println(donor.getName() + " está apto(a) para doar sangue!");
			}
		}
		else if(donor.getAge() >= 18 && donor.getAge() < 60) {
			System.out.println(donor.getName() + " está apto(a) para doar sangue!");
		}
		else {
			System.out.println(donor.getName() + " não está apto para doar sangue!");
		}*/
	
		
		sc.close();
	}

}
