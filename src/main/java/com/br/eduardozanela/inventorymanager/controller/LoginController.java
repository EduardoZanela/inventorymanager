package com.br.eduardozanela.inventorymanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/")
	public String login() {
		return "home page";
	}
	
}
