package com.office.ex;

public class AutenticationDto {

	private String id;
	private String pw;
	private String mail;
	
	public AutenticationDto(String id, String pw, String mail) {
		setId(id);
		setId(pw);
		setId(mail);
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
