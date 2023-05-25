package aula2;

import java.util.Scanner;

public class ProgramAnimals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String segment = sc.next();
		String species = sc.next();
		String type = sc.next();
		
		if (segment.equals("vertebrado")) {
			if (species.equals("ave")) {
				if(type.equals("carnívoro")) {
					System.out.println("Águia");
				}else {
					System.out.println("Pomba");
				}
			}else if(species.equals("mamífero")) {
				if(type.equals("onívoro")) {
					System.out.println("Homem");
				}
				else {
					System.out.println("Vaca");
				}
			}
		}
		else if(segment.equals("invertebrado")) {
			if(species.equals("inseto")) {
				if(type.equals("hematófago")) {
					System.out.println("Pulga");
				}
				else {
					System.out.println("Lagarta");
				}
			}else if(species.equals("anelídeo")) {
				if (type.equals("hematófago")) {
					System.out.println("Sanguessuga");
				}
				else {
					System.out.println("Minhoca");
				}
			}
		}
		
		
		sc.close();
	}

}
