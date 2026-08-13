package com.office.ex;

public class Service {
	
	/*
	public void doAutentication(int num, AutenticationDto autenticationDto) {
	
		switch (num) {
		case 1:		// ID, PW
			
			AutenticationByIdPw autenticationByIdPw =
				new AutenticationByIdPw();
			autenticationByIdPw.autentication(autenticationDto);
			break;
		
		case 2:     // ID, PW, Mail	
			
			AutenticationByIdPwMail  autenticationByIdPwMail =
				new AutenticationByIdPwMail();
			autenticationByIdPwMail.autentication(autenticationDto);
			break;

		}
		
	}
	*/
	
	public void doAutentication(IAutentication iAutentication, AutenticationDto autenticationDto) {
		
		
		iAutentication.autentication(autenticationDto);
	}
	
}
