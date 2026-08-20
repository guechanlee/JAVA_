package com.office.dbex.member;

import java.util.Scanner;

import com.office.dbex.IConfig;

public class MemberController 
				implements IMember, IConfig {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			
			int userSelectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			String memId = null;
			String memPw = null;
			String memMail = null;
			String memPhone = null;
			
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:
				
				System.out.println("Please input new member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please input new member PW!!");
				memPw = scanner.nextLine();
				
				System.out.println("Please input new member MAIL!!");
				memMail = scanner.nextLine();
				
				System.out.println("Please input new member PHONE!!");
				memPhone = scanner.nextLine();
				
				MemberDto memberDtoForSingUp = new MemberDto(memId, memPw, memMail, memPhone);
				
				int resultForSignUp = memberService.doSignUp(memberDtoForSingUp);	// 0: 실패 1:성공
				
				if (resultForSignUp > MEMBER_SIGN_UP_FAIL) {
					System.out.println("[MemberController] NEW MEMBER SIGN-UP SUCCESS!!");
					
				} else {
					System.out.println("[MemberController] NEW MEMBER SIGN-UP FAIL!!");
					
				}
				
				break;

			case MEMBER_SIGN_IN:
				
				System.out.println("Please input member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please input member PW!!");
				memPw = scanner.nextLine();
				
				MemberDto memberDtoForSingIn = new MemberDto(memId, memPw);
				
				boolean resultForSignIn = memberService.doSignIn(memberDtoForSingIn);
				
				if (resultForSignIn) {
					System.out.println("[MemberController] MEMBER SIGN-IN SUCCESS!!");
					
				} else {
					System.out.println("[MemberController] MEMBER SIGN-IN FAIL!!");
					
				}
				
				break;
				
			case MEMBER_MODIFY:
				
				break;
				
			case MEMBER_DELETE:
				
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Say Gooooooooooooooooooooooooooooood bye~!");
				break;
			}
			
		}
		
		scanner.close();
		
	}
	
}