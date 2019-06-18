package com.udemy.backendninja.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
public class Example2 {



	@Controller
	@RequestMapping("/example2")
	public class Example2Controller {
		
		public static final String EXAMPLE = "example2";
		
		@GetMapping("/request1")
		public ModelAndView exampleString(@RequestParam(name="nm") String name) {
			ModelAndView mav = new ModelAndView(EXAMPLE);
			mav.addObject("nm_in_model", name);
			return mav;
		}
	}
}
