package com.shpping.member.boot;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class RestMemberController {

	private MemberServiceImpl memberserviceimpl;
	
	@Autowired
	public RestMemberController(MemberServiceImpl memberserviceimpl) {
		this.memberserviceimpl = memberserviceimpl;
	}
	
	@PostMapping("{memberId}/insert")
	public String MemberInsert( MemberBean bean, 
			HttpSession session, @PathVariable MemberBean memberId  ) {
		String msg = "success";
		int result = memberserviceimpl.MemberInsert(bean);
		if(result < 1) {
			msg = "Death";
		}else if(result >= 1) {
			session.setAttribute("memberId", bean.getMember_id());
		}
		return msg;
	}

	
}
