package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Produto;

public class TestaGame {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Produto p1 = new Produto(
				"The last of us",
				"Game",
				LocalDate.parse("10/08/2022", fmt),
				200.00,
				"Sony Interactive Entertainment");
		
		Produto p2 = new Produto(
				"Controle PS4",
				"Controle",
				LocalDate.parse("02/04/2023", fmt),
				300.00,
				"Playstation");
				
		System.out.println(p1.visualizar());
		System.out.println();
		System.out.println(p2.visualizar());
	}

}
