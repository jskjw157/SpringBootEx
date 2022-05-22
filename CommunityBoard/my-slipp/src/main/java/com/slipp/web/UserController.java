package com.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.slipp.domain.User;
import com.slipp.domain.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	private List<User> users = new ArrayList<>();
	
	@PostMapping("/user/create")
	public String createUser(User user) {
		System.out.println(user);
		userRepository.save(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String userList(Model model) {
		
		model.addAttribute("users",userRepository.findAll());
		
		return "/user/list.html";
	}
	

}
