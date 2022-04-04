package com.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome( Model model) {
		model.addAttribute("name", "jiwon");
		model.addAttribute("company", "<b>git</b>");
		model.addAttribute("age", 30);
		return "welcome";
	}
	
}
