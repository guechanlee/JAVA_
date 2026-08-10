package com.office.member;

public class MemberService {

	MemberDao memberDao = new MemberDao();
	MemberService doModify = new DoModify();
	
	// sign-up
	public void doSignUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSignUp()");
		
		// 회원가입 진행
//		MemberDao memberDao = new MemberDao(); 
		memberDao.insertMember(memberDto);
		
		
	}

	public void doSignIn(MemberDto memberDto) {		// id, pw
		System.out.println("[MemberService] doSignIn()");
		
//		MemberDao memberDao = new MemberDao();
		MemberDto selectedMemberDto = memberDao.selectMemberByMemId(memberDto.memId);
		
		if (selectedMemberDto != null) {
			// 존재하는 ID
			if (memberDto.memPw.equals(selectedMemberDto.memPw)) {
				System.out.println("SIGN-IN SUCCESS");
				doModify(selectedMemberDto);;
			} else {
				System.out.println("Sorry. SIGN-IN FAIL!!");
			}
			
		} else {
			// 존재하지 않은 ID
			System.out.println("Sorry. SIGN IN FAIL!!");
		}
		
	}

	public void doModify(MemberDto memberDto) {
		System.out.println("[MemberService] doModify()");
		
		
	}
}
