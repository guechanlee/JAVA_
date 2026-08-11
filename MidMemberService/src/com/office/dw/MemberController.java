package com.office.dw;

import java.util.Scanner;

public class MemberController {

	final int MEMBER_SIGN_UP = 1;
	final int MEMBER_SIGN_IN = 2;
	final int MEMBER_MODIFY = 3;
	final int MEMBER_DELETE = 4;
	final int MEMBER_SYSTEM_OUT = 99;
	
	
	public void execute() {
		System.out.println("[MemberController] execute()");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		String memId = null;
		String memPw = null;
		String memMail = null;
		String memPhone = null;
		
		MemberService memberService = new MemberService();

		
		
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP   2.SIGN-IN      3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			
			int userSelectedMenuNumber = scanner.nextInt();  // /n
			scanner.nextLine();
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:				// sign-up
				
				System.out.println("Please Input New Member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please Input New Member PW!!");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input New Member MAIL!!");
				memMail = scanner.nextLine();
				
				System.out.println("Please Input New Member PHONE!!");
				memPhone = scanner.nextLine();
				
//				memberService = new MemberService();
				memberService.doSignUp(new MemberDto(memId, memPw, memMail, memPhone));
				
				break;
				
			case MEMBER_SIGN_IN:				// sign-in
				
				System.out.println("Please Input Member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW!!");
				memPw = scanner.nextLine();
				
//				memberService = new MemberService();
				memberService.doSignIn(new MemberDto(memId, memPw, null, null));
				
				break;
				
			case MEMBER_MODIFY:				// modify
				
				/*
				 * 1. 사용자가 ID, PW, MAIL, PHONE을 입력하고,
				 * 2. 그러면 ID, PW을 가지고 인증을 하고,
				 * 3. 인증이 되고나면 그러면 MAIL, PHONE 정보를 업데이트 하기로 합니다. 
				 */
				
				System.out.println("Please Input Member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW!!");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input Member MAIL!!");
				memMail = scanner.nextLine();
				
				System.out.println("Please Input Member PHONE!!");
				memPhone = scanner.nextLine();
				
				memberService.modify(new MemberDto(memId, memPw, memMail, memPhone));
				
				break;
				
			case MEMBER_DELETE:				// delete
				
				/*
				 * 1. 사용자가 ID, PW을 입력하고,
				 * 2. 그러면 ID, PW을 가지고 인증을 하고,
				 * 3. 인증이 되고나면 삭제 하기로 한다.
				 */
				
				System.out.println("Please Input Member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW!!");
				memPw = scanner.nextLine();
				
				memberService.delete(new MemberDto(memId, memPw, null, null));
				
				break;
				
			case MEMBER_SYSTEM_OUT:			// system-out
				systemFlag = false;
				System.out.println("SYSTEM OUT");
				break;
			}
		}
		
		
		
		scanner.close();
		
		
	}

}
