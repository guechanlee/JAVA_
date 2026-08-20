package com.office.dbex.session;

public class SessionClass {

	private static SessionClass session;
	private String signInedMemberId = null;
	
	private SessionClass() {}
	
	public static SessionClass getInstance() {
		
		if (session == null) {
			session = new SessionClass();
		}
		
		return session;
		
	}

	public String getSignInedMemberId() {
		return signInedMemberId;
	}

	public void setSignInedMemberId(String signInedMemberId) {
		this.signInedMemberId = signInedMemberId;
	}
	
}
