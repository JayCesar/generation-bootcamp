package aula7_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class camada_pilha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		
		printMenu();
		
		System.out.print("\nEntre com a opção desejada: ");
		int choiceList = sc.nextInt();
		
		while(verifyOption(choiceList)) {
			switch(choiceList) {
				case 1:
					sc.nextLine();
					System.out.print("\nDigite o nome: ");
					String nameInput = sc.nextLine();
					fila.add(nameInput);
					System.out.println("\nFila:");
					System.out.println("\n" + nameInput);
					System.out.println("\nCliente adicionado!");
					System.out.print("\nDeseja continuar o programa (s/n)? ");
					choiceList = verifyInput(sc.next().toLowerCase().charAt(0));
					/*char keep = sc.next().toLowerCase().charAt(0);
					if (keep == 'n') {
						choiceList = 0;
						System.out.println("\nPrograma Finalizado!");
					}
					else {
						System.out.print("\nEntre com a opção desejada: ");
						int localOption = sc.nextInt();
						verifyOption(localOption);
						choiceList = localOption;
						sc.nextLine();
					}*/
					break;
				case 2: 
					System.out.println("\nLista de Clientes na Fila:");
					fila.forEach(name -> System.out.println(name));
					System.out.print("\nDeseja continuar o programa (s/n)? ");
					char keep1 = sc.next().toLowerCase().charAt(0);
					if (keep1 == 'n') {
						choiceList = 0;
						System.out.println("\nPrograma Finalizado!");
					}
					else {
						System.out.print("\nEntre com a opção desejada: ");
						int localOption = sc.nextInt();
						verifyOption(localOption);
						choiceList = localOption;
						sc.nextLine();
					}
					break;
				case 3:
					if (fila.poll() != null) {
						System.out.println("\nFila:\n");
						fila.forEach(n -> System.out.println(n));
						System.out.println("\nO Cliente foi Chamado!");
					}else {
						System.out.println("\nA Fila está vazia!");
					}
					System.out.print("\nDeseja continuar o programa (s/n)? ");
					char keep2 = sc.next().toLowerCase().charAt(0);
					if (keep2 == 'n') {
						choiceList = 0;
						System.out.println("\nPrograma Finalizado!");
					}
					else {
						System.out.print("\nEntre com a opção desejada: ");
						int localOption = sc.nextInt();
						verifyOption(localOption);
						choiceList = localOption;
						sc.nextLine();
					}
					break;
				default:
					System.out.println("Test");	
			}
		
		}
	
		sc.close();
	}
	
	
	public static void printMenu() {
		for (int i = 0; i <= 50; i++) System.out.print("*");
		System.out.println("\n");
		System.out.println("\t 1 - Adicionar Cliente na Fila");
		System.out.println("\t 2 - Listar todos os Clientes");
		System.out.println("\t 3 - Retirar Cliente da Fila");
		System.out.println("\t 0 - Sair");
		System.out.println("");
		for (int i = 0; i <= 50; i++) System.out.print("*");
	}
	
	public static boolean verifyOption(int inputOption) {
		int option = inputOption;
		Scanner sc = new Scanner(System.in);
		while (!(option <= 3) || !(option > -1)) {
			System.out.println("\nOpção inválida!");
			System.out.print("Digite novamente: ");
			option = sc.nextInt();
		}
		return (option != 0) ? true : false;
	}
	
	public static int verifyInput(char response) {
		char input = response;
		Scanner sc = new Scanner(System.in);
		if (input == 'n') {
			System.out.println("\nPrograma Finalizado!");
			return 0;
		}else {
			System.out.print("\nEntre com a opção desejada: ");
			int choiceList = sc.nextInt();
			verifyOption(choiceList);
			return choiceList;
		}
	}
	
	/*char keep = sc.next().toLowerCase().charAt(0);
	if (keep == 'n') {
		choiceList = 0;
		System.out.println("\nPrograma Finalizado!");
	}
	else {
		System.out.print("\nEntre com a opção desejada: ");
		int localOption = sc.nextInt();
		verifyOption(localOption);
		choiceList = localOption;
		sc.nextLine();
	}*/

}
