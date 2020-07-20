package com.shpping.main.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("main")
	public String main() {
		return "main";
	}
	@GetMapping(value = "loginForm")
	public String loginFrim() {
		return "members/LoginForm";
	}
	@GetMapping(value = "memberForm")
	public String memberForm() {
		return "members/MemberForm";
	}
	
	
}
