package com.office.ex;

public class AutenticationByIdPw implements IAutentication {

	 
		
	@Override
	public void autentication(AutenticationDto autenticationDto) {
		// TODO Auto-generated method stub
		
		// gildong, 1234 이면 인증 완료
		if (autenticationDto.getId().equals("gildong") 
				&&
				autenticationDto.getPw().equals("1234")) {
			System.out.println("AUTENTICATION SUCCESS!!");
		
		} else {
			System.out.println("AUTENTICATION FAIL!!");
		}
	
		
		
	}
		

	
}
