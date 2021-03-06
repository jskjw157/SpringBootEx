package com.slipp.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome( Model model) {
		List<MyModel> repo = Arrays.asList(new MyModel("jiwon"),new MyModel("dahee"),new MyModel("javajigi"));
		model.addAttribute("repo", repo);
		return "welcome";
	}
	
}
