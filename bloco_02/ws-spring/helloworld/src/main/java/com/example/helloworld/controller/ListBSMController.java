package com.example.helloworld.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-list")
public class ListBSMController {

	List<String> bsmList  = new ArrayList<>(Arrays.asList("Proatividade", "Orientação aos detalhes", "Orientação ao futuro", "Responsabilidade pessoal", "Persistência", "Comunicação", "Trabalho em equipe"));

	@GetMapping
	public String listBSM() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de BSM's da Generagion Brasil: ");
		bsmList.forEach(bsm -> sb.append(bsm).append("; "));
		return sb.toString();
	}
}
