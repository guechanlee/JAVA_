package com.office.ex;

public class AutenticationByIdPwMail implements IAutentication {


	@Override
	public void autentication(AutenticationDto autenticationDto) {

		// gildong, 1234 이면 인증 완료
		if (autenticationDto.getId().equals("gildong") 
				&&
				autenticationDto.getPw().equals("1234") 
				&&
				autenticationDto.getMail().equals("gildong@gmail.com")) {
			System.out.println("AUTENTICATION SUCCESS!!");
		
		} else {
			System.out.println("AUTENTICATION FAIL!!");
		}
		
	}
	
	
	
}
