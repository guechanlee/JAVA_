package com.office.member;

import java.util.ArrayList;

public class MemberDao {
	
	ArrayList<MemberDto> memberDB = new ArrayList<MemberDto>();
	
	
	public void insertMember(MemberDto memberDto) {
		System.out.println("[MemberDao] inserMember()");
		
		memberDB.add(memberDto);
		
	}


	public MemberDto selectMemberByMemId(String memId) {
		System.out.println("[MemberDao] selectMemberByMemId()");
		
		for(int i = 0; i < memberDB.size(); i++) {
			MemberDto dto = memberDB.get(i);
			if (dto.memId.equals(memId)) {
				return dto;
			}
		}
		return null;
	}
	
}
