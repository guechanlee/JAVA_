package com.office.dw;

public class MemberDto {

	// 1. 만들기 속성
	
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	
	
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		setMemId(memId);
		setMemPw(memPw);
		setMemMail(memMail);
		setMemPhone(memPhone);
		
	}
	
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	
	
	
	
}
