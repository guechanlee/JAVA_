package com.office.dbex.member;

public class MemberService implements IMember {

	MemberDao memberDao = new MemberDao();
	
	// sign-up
	public int doSignUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSignUp()");
		
		int result = memberDao.insertNewMember(memberDto);
		
//		if (result > 0) {
//			System.out.println("[MemberService] NEW MEMBER SIGN-UP SUCCESS!!");
//			
//		} else {
//			System.out.println("[MemberService] NEW MEMBER SIGN-UP FAIL!!");
//			
//		}
		
		switch (result) {
		case MEMBER_SIGN_UP_SUCCESS:
			System.out.println("[MemberService] NEW MEMBER SIGN-UP SUCCESS!!");  // 1
			break;

		case MEMBER_SIGN_UP_FAIL:
			System.out.println("[MemberService] NEW MEMBER SIGN-UP FAIL!!");	//  0
			break;
			
		default:
			System.out.println("[MemberService] NEW MEMBER SIGN-UP FAIL!!");
			break;
		}
		
		return result;
		
	}

	// sign in
	public boolean doSignIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSignIn()");
		
		// ID, PW
		MemberDto selectedMemberDto =
				memberDao.selectMemberByMemId(memberDto.getMemId());
		
		/*
		if (selectedMemberDto != null) {
			System.out.println("[MemberService] MEMBER SIGN-IN SUCCESS!!");
			return MEMBER_SIGN_IN_SUCCESS;
			
		} else {
			System.out.println("[MemberService] MEMBER SIGN-IN FAIL!!");
			return MEMBER_SIGN_IN_FAIL;
		}
		*/
		
		if (selectedMemberDto != null) {
			
			if (selectedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
				System.out.println("[MemberService] MEMBER SIGN-IN SUCCESS!!");
				
				return MEMBER_SIGN_IN_SUCCESS;
				
			} else {
				System.out.println("[MemberService] MEMBER SIGN-IN FAIL!!");
				System.out.println("[MemberService] PW NG!!");
				
				return MEMBER_SIGN_IN_FAIL;
			}
			
		} else {
			System.out.println("[MemberService] MEMBER SIGN-IN FAIL!!");
			System.out.println("[MemberService] ID NG!!");
			
			return MEMBER_SIGN_IN_FAIL;
			
		}
		
	}

}
