package org.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NormalController {
	
	@GetMapping("/home")
	public String home_page(Model model){
		model.addAttribute("title", "Home page");
		return "normal/home.html";
	}
	
	@GetMapping("/about")
	public String about_page(Model model){
		model.addAttribute("title", "About page");
		return "normal/about.html";
	}
	
	@GetMapping("/register")
	public String signUp_page(Model model){
		model.addAttribute("title", "About page");
		return "normal/registration.html";
	}

}
