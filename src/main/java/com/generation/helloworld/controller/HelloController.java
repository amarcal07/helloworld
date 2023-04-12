package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello World</b>";
	}
	

	@GetMapping("/bsm")
	public String listaBsm() {
		return "<b>Responsabilidade Pessoal<br/>Mentalidade de Crescimento<b></br>Orientação para o Futuro</br>Persitência</br>";
   }
	
	@GetMapping("/objetivos")
	public String objetivosAprendizagem() {
		return "<b>Comunicação<br/>Trabalho em Equipe<b></br>Orientação ao Detalhe</br>";
		
	}	
}