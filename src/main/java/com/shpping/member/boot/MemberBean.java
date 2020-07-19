package com.shpping.member.boot;


public class MemberBean {

	private int member_seq;
	private String member_id;
	private String member_pass;
	private String member_nicname;
	private int phone_num;
	
	
	public int getMember_seq() {
		return member_seq;
	}
	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pass() {
		return member_pass;
	}
	public void setMember_pass(String member_pass) {
		this.member_pass = member_pass;
	}
	public String getMember_nicname() {
		return member_nicname;
	}
	public void setMember_nicname(String member_nicname) {
		this.member_nicname = member_nicname;
	}
	public int getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
	@Override
	public String toString() {
		return "MemberBean [member_seq=" + member_seq + ", member_id=" + member_id + ", member_pass=" + member_pass
				+ ", member_nicname=" + member_nicname + ", phone_num=" + phone_num + "]";
	}
	
	
	
	
}
