package com.shpping.main.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("main")
	public String main() {
		return "main";
	}
	@RequestMapping(value = "loginForm")
	public String loginFrim() {
		return "members/LoginForm";
	}
	
}
