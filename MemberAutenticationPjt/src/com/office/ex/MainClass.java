package com.office.ex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		
		String id;
		String pw;
		String mail; 
//		IAutentication iAutentication = null;
		
		// ID, PW == 1
		/*
		System.out.println("Enter ID & PW: ");
		String id = scanner.nextLine();
		String pw = scanner.nextLine();
		
		Service service = new Service();
		service.doAutentication(1, new AutenticationDto(id, pw, null));
		*/
		
		// ID, PW, MAIL == 2
		/*
		System.out.println("Enter ID & PW: ");
		id = scanner.nextLine();
		pw = scanner.nextLine();
		String mail = scanner.nextLine();
		
		
		Service service = new Service();
		service.doAutentication(2, new AutenticationDto(id, pw, mail));
		*/
		
		/*
		// 1 ID, PW
		System.out.println("Enter ID & PW");
		id = scanner.nextLine();
		pw = scanner.nextLine();
		
		service.doAutentication(
				new AutenticationByIdPw(),
				new AutenticationDto(id, pw, null));
		*/
		
		
		// 2 ID, PW, MAIL
		System.out.println("Enter ID & PW & MAIL");
		id = scanner.nextLine();
		pw = scanner.nextLine();
		mail = scanner.nextLine();
		
		service.doAutentication(
				new AutenticationByIdPwMail(),
				new AutenticationDto(id, pw, mail));
		
		
		
		scanner.close();
	}
	
}