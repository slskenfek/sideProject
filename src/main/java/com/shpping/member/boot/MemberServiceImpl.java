package com.shpping.member.boot;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl {

	private MemberMapper membermapper; 
	
	public int MemberInsert(MemberBean bean) {
		
		return membermapper.MemberInsert(bean);
	}

	
}
