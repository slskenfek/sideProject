package com.shpping.member.boot;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/members")
@RestController
public class RestMemberController {

	private MemberServiceImpl memberserviceimpl;
	
	@Autowired
	public RestMemberController(MemberServiceImpl memberserviceimpl) {
		this.memberserviceimpl = memberserviceimpl;
	}
	
	@GetMapping()
	public List MemberInfo(@RequestParam HashMap<String, Object> param) {
		
		return null;
	}

	
}
