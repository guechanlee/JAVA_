package com.office.dw;

public class MemberDto {

	String memId;
	String memPw;
	String memMail;
	String memPhone;
	
	//생성자 오버로딩
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}
	
	
	
}
