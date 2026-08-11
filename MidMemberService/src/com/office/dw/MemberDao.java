package com.office.dw;

import java.util.HashMap;

//ctrl + shift + o -> Import 자동 정리/추가 단축키
//ctrl + shift + o -> 필요 없는 Import 자동제거
//import java.util.ArrayList;

public class MemberDao {

//	ArrayList<MemberDto> memberDB = new ArrayList<MemberDto>();
	
	HashMap<String, MemberDto> memberDB = new HashMap<String, MemberDto>();
 	

	
	public void insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] i  nsertNewMember()");
	
//		memberDB.add(memberDto);
		memberDB.put(memberDto.memId, memberDto);
		
//		System.out.println(memberDB.get(0).memId);
//		System.out.println(memberDB.get(0).memPw);
//		System.out.println(memberDB.get(0).memMail);
//		System.out.println(memberDB.get(0).memPhone);
	}

	public MemberDto selectMemberDtoByMemId(String memId) {
		System.out.println("[MemberDto] selectMemberDtoByMemId()");
		
		// ArrayList일때
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memId)) {
//				return dto;
//			}
//		}
//		
//		return null;
		
		// HashMap일때
		MemberDto memberDto = memberDB.get(memId);
		return memberDto;
	}

	public void updateMemberForMailAndPhone(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		// ArrayList일때
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memberDto.memId)) {
//				dto.memMail = memberDto.memMail;
//				dto.memPhone = memberDto.memPhone;
//				
//				System.out.println("Mail: " + dto.memMail);
//				System.out.println("Phone: " + dto.memPhone);
//				
//				break;
//			}
//		}
		
		// HashMap일때
		memberDB.put(memberDto.memId, memberDto);
		
	}


	public void deleteMemberByMemId(String memId) {
		System.out.println("[MemberDao] deleteMemberByMemId()");
	
		// ArrayList일때
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memId)) {
//				memberDB.remove(i);
//				
//				System.out.println(memberDB.size());		// 0
//			}
//		}
		
		// HashMap일때
		memberDB.remove(memId);
	}

}
