package aula7_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class camada_pilha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		
		
		for (int i = 0; i <= 50; i++) System.out.print("*");
		System.out.println("\n");
		System.out.println("\t 1 - Adicionar Cliente na Fila");
		System.out.println("\t 2 - Listar todos os Clientes");
		System.out.println("\t 3 - Retirar Cliente da Fila");
		System.out.println("\t 0 - Sair");
		System.out.println("");
		for (int i = 0; i <= 50; i++) System.out.print("*");
		
		System.out.print("\nEntre com a opção desejada: ");
		int inputOption = sc.nextInt();
		sc.nextLine();
		fila.add("Julio");
		fila.add("Julio");
		fila.add("Julio");
		switch (inputOption){
			case 1:
				System.out.print("\nDigite o nome: ");
				String name = sc.nextLine();
				fila.add(name);
				System.out.println("\nFila:");
				System.out.println("\n" + name);
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila:");
				fila.forEach(n -> System.out.println(n));
				break;
			case 3:
				if (fila.poll() != null) {
					System.out.println("\nFila:\n");
					fila.forEach(n -> System.out.println(n));
					System.out.println("\nO Cliente foi Chamado!");
				}else {
					System.out.println("\nA Fila está vazia!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default: verifyOption(inputOption);
		}

	}
	
	public static int verifyOption(int inputOption) {
		int option = inputOption;
		Scanner sc = new Scanner(System.in);
		while(!(option <= 3) && option > 0) {
			System.out.println("\nOpção inválida!");
			System.out.print("Digite novamente: ");
			option = sc.nextInt();
		}
		sc.close();
		return option;
	}

}
