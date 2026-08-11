package com.office.member;

import java.util.Scanner;

public class MemberController {

	//사용자에게 요청을 받아서 분석 -> 따라서 메서드 생성
	public void execute() {
		System.out.println("[MemberController] execute");
		
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		
		MemberDto memberDto = null;
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		while (systemFlag) {
			System.out.println("1.sign-up	2.sign-in	3.MODIFY	4.DELETE 	99.SYSTEM-OUT");
			System.out.println("Please MENU NUMBER!!");
			
			
			int selectedNumber = scanner.nextInt();
			scanner.nextLine();
			
			switch (selectedNumber) {
			case 1:					// sign-up
				System.out.println("Please new member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please new member PW!!");
				memPw = scanner.nextLine();
				
				System.out.println("Please new member MAIL!!");
				memMail = scanner.nextLine();
				
				// 이제 요청 받은 것을 Dto를 통해 묶어서 보내기
				memberDto = new MemberDto(memId, memPw, memMail);
				
				// 서비스로
//				memberService = new MemberService();
				memberService.doSignUp(memberDto);
				
				break;
				
			case 2:					// sign-in
				System.out.println("Please member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please member PW!!");
				memPw = scanner.nextLine();
				
				memberDto = new MemberDto(memId, memPw, null);
//				memberService = new MemberService();
				memberService.doSignIn(memberDto);
				break;
				
			case 3:					// MODIFY
				System.out.println("Please member ID!!");
				memId = scanner.nextLine();
				
				System.out.println("Please member PW!!");
				memPw = scanner.nextLine();
				
				memberDto = new MemberDto(memId, memPw, null);
				memberService.doSignIn(memberDto);
				break;
				
			case 4:  				// DELETE
		
				break;
				
			case 99:			    // SYSTEM-OUT
				systemFlag = false;
				System.out.println("Good bye~~");
				break;
				
			}
		}
		scanner.close();
		
	}
		
		
		
	
}
