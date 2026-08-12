package com.office.dw;

public class MemberService {

	MemberDao memberDao = new MemberDao();
	
	public void doSighUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSighUp()");
		
		memberDao.insertNewMember(memberDto);
		
	}

	public boolean doSighIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSighIn()");
		
		
		MemberDto selectedMemberDto = memberDao.selectedMemberDtoByMemId(memberDto.getMemId());
		
		if (selectedMemberDto != null) {
			if (selectedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
				System.out.println("[MemberService] SIGN-IN SUCCESS!!");
				return true;
			} else {
				System.out.println("[MemberService] SIGN-IN FAIL!!");
				return false;
			}
			} else {
				System.out.println("[MemberService] SIGN-IN FAIL!!");
				return false;
			}
			
	}

	
	
}
