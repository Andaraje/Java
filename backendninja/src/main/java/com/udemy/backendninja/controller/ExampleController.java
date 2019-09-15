package com.udemy.backendninja.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static String EXAMPLE = "example";
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return EXAMPLE;
	}
	
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("people", getPeople());
		mav.setViewName(EXAMPLE);
		return mav;
	}
	
	
	private ArrayList<Person> getPeople() {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Manue", 23));
		people.add(new Person("Danie", 88));
		people.add(new Person("Gabrie", 55));
		people.add(new Person("Sunormah", 8));
		people.add(new Person("brese", 25));
		people.add(new Person("Eva", 13));
		return people;
	}
}
