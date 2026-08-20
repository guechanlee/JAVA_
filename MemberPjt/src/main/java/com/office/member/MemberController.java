package com.office.member;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("*.dw")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public MemberController() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String requestURI = request.getRequestURI();
		System.out.println("requestURI: " + requestURI);
		
		String contextPath = request.getContextPath();
		System.out.println("contextPath: " + contextPath);
		
		String command = requestURI.substring(contextPath.length());
		System.out.println("command: " + command);
		
		
		MemberService memberService = null;
		
		if (command.equals("/member_signup_confirm.dw")) {
			System.out.println("SIGN UP!!");
			
			memberService = new MemberService();
			
			int result = memberService.memberRegistrConfirm(request, response);
			
		} else if (command.equals("/member_signin_confirm.dw")) {
			System.out.println("SIGN IN!!");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
