package com.gcu;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}