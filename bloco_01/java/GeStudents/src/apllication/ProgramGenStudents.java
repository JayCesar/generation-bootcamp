package apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.GenStudent;

public class ProgramGenStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<GenStudent> studentsList = new ArrayList<>();

		printMenu();
		readNames(studentsList, fmt);

		System.out.print("\nEntre com a opção desejada: ");
		int optionList = sc.nextInt();

		while (verifyOption(optionList)) {
			switch (optionList) {
			case 1:
				System.out.println("Ordem por idade: ");
				Collections.sort(studentsList);
				studentsList.forEach(s -> System.out.println("\nNome: " + s.getName() + "\nData de nacimento: " + s.getBirthDate() + "\nIdade atual: " + s.calculateAge(currentDate) + " anos."));
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				optionList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 2:

				System.out.print("\nDeseja continuar o programa (s/n)? ");
				optionList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			case 3:
				System.out.print("\nDeseja continuar o programa (s/n)? ");
				optionList = verifyInput(sc.next().toLowerCase().charAt(0));
				break;
			}
		}
		System.out.println("\nPrograma Finalizado!");
		sc.close();
	}

	
	// Lista por Signo
	
	// Imprime o menu
	public static void printMenu() {
		for (int i = 0; i <= 50; i++)
			System.out.print("*");
		System.out.println("\n");
		System.out.println("\t 1 - Ordenar alunes por idade");
		System.out.println("\t 2 - Verificar se alguém faz aiversário hoje");
		System.out.println("\t 3 - Acessar dados de algum alune");
		System.out.println("\t 0 - Sair");
		System.out.println("");
		for (int i = 0; i <= 50; i++)
			System.out.print("*");
	}

	// Read files
	public static void readNames(List<GenStudent> studentsList, DateTimeFormatter fmt) {
		String path = "D:\\workspace\\ws-spring\\GeStudents\\src\\files\\genStudents_data.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String genStudent = br.readLine();
			while (genStudent != null) {
				String[] fields = genStudent.split(",");
				studentsList.add(
						new GenStudent(fields[0], fields[1], LocalDate.parse(fields[2], fmt), fields[3], fields[4]));
				genStudent = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Verify option
	public static boolean verifyOption(int optionList) {
		int option = optionList;
		Scanner sc = new Scanner(System.in);
		while (!(option <= 3) || !(option > -1)) {
			System.out.print("\nOpção inválida! \nDigite novamente: ");
			option = sc.nextInt();
		}
		return (option != 0) ? true : false;
	}

	// Verifica se o user deseja continuar
	public static int verifyInput(char response) {
		char input = response;
		Scanner sc = new Scanner(System.in);
		while (input != 'n' && input != 's') {
			System.out.print("\nOpção inválida! \nDigite novamente: ");
			input = sc.next().toLowerCase().charAt(0);
		}
		if (input == 'n') {
			System.out.println("\nPrograma Finalizado!");
			return 0;
		} else {
			printMenu();
			System.out.print("\nEntre com a opção desejada: ");
			int choiceList = sc.nextInt();
			verifyOption(choiceList);
			return choiceList;
		}
	}

	// Verifica aniversariante
	/*public static List<GenStudent> verifyBirthDay(List<GenStudent> studentsList, LocalDate currentDate) {
	    List<GenStudent> birthDayStudents = new ArrayList<>();
	    for (GenStudent gStudent : studentsList) {
	        if (gStudent.getBirthDate().getMonth() == currentDate.getMonth()) {
	            birthDayStudents.add(gStudent);
	        }
	    }
	    return birthDayStudents;
	}*/

}
