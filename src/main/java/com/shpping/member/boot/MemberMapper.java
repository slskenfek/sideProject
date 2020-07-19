package com.shpping.member.boot;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

	int MemberInsert(MemberBean bean);

}
