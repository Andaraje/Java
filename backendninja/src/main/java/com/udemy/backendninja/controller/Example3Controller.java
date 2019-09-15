package com.udemy.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	private final String EXAMPLE3 = "form";
	
	
	@GetMapping("/index")
	public String index3(Model model) {
		Person person = new Person("Manolito pies de plata", 22);
		model.addAttribute("people", person);
		return EXAMPLE3;
	}
}
