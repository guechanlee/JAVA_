package com.office.dw;

import java.util.HashMap;

public class MemberDao {
	
	HashMap<String, MemberDto> memberDB = new HashMap<String, MemberDto>();

	public void insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		memberDB.put(memberDto.getMemId(), memberDto);
	}

	public MemberDto selectedMemberDtoByMemId(String memId) {
		System.out.println("[MemberDto] selectMemberDtoByMemId()");
		
		MemberDto memberDto = memberDB.get(memId);
		return memberDto;
	}

	
	
}
