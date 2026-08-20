package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {

	public int memberRegistrConfirm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] memberRegistrConfirm");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
		System.out.println("memId: " + memId);
		System.out.println("memPw: " + memPw);
		System.out.println("memMail: " + memMail);
		System.out.println("memPhone: " + memPhone);
		
		MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
		
		return 0;
	}

	
}
