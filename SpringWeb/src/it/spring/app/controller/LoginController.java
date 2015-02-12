package it.spring.app.controller;

	 
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	 
	@Controller
	public class LoginController {
	 
	@RequestMapping("/")
	 public String login(Model model) {
	 	 return "login";
	 }
	 
	}

