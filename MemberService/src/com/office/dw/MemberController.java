package com.office.dw;

import java.util.Scanner;

public class MemberController {

	final int MEMBER_SIGN_UP = 1;
	final int MEMBER_SIGN_IN = 2;
	final int MEMBER_MODIFY = 3;
	final int MEMBER_DELETE = 4;
	final int SYSTEM_OUT = 99;
	
	MemberService memberService = new MemberService();
	
	public void execute() {
		System.out.println("[MemberController] execute()");
		
		Scanner scanner = new Scanner(System.in);
		
		String memId = null;
		String memPw = null;
		String memMail = null;
		String memPhone = null;
		
		boolean systemflag = true;
		
		
		while (systemflag) {
			System.out.println("1.회원가입     2.로그인    3.수정    4.삭제    99.시스템 종료");
			int userSelectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:
				System.out.println("Please Input New ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input New PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input New EMAIL");
				memMail = scanner.nextLine();
						
				System.out.println("Please Input New PHONE");
				memPhone = scanner.nextLine();
				
//				MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				memberService.doSighUp(new MemberDto(memId, memPw, memMail, memPhone));
				
				
				break;
				
			case MEMBER_SIGN_IN:
				System.out.println("Please Input New ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input New PW");
				memPw = scanner.nextLine();
				
//				MemberDto memberDto2 = new MemberDto(memId, memPw, null, null);
				memberService.doSighIn(new MemberDto(memId, memPw, null, null));
				
				
				break;
				
			case MEMBER_MODIFY:
				
				break;
	
			case MEMBER_DELETE:
	
				break;
	
			case SYSTEM_OUT:
	
				break;
			}
		}
		
		
		
	}

}
