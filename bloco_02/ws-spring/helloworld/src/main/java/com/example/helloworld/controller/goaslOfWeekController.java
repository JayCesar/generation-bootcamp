package com.example.helloworld.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goals-of-week")
public class goaslOfWeekController {

	List<String> listGoals = new ArrayList<>(Arrays.asList("Finalizar um curso de 5h de SQL",
	"Terminar os exercícios de SQL", "Voltar ao ritmo de estudos de JAVA"));

	@GetMapping
	public List<String> goalsOfTheWeek() {
		return listGoals;
	}

}
