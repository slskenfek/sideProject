package com.test.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("main")
	public String main() {
		return "main";
	}
	
	
}
