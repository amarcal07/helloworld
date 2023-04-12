package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello turma 62!</b>";
	}
	

	@GetMapping("/nome")
	public String meuNome() {
		return "<b>Hello!<br/>Andresa Marcal</b>";
   }
	
}