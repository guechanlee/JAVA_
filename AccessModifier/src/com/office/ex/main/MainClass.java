package com.office.ex.main;

import com.office.ex.controller.PayController;

public class MainClass {
	
	/*
	 * 접근제어자     |   의미
	 * private	   |  같은 클래스 내에서만 접근 가능	
	 * default     |  private + 같은 패키지 내에서 접근 가능   -> 앞에 아무것도 표현하지 않는다.
	 * protected   |  default + 상속 관계일 때 자식 클래스에서 접근 가능
	 * public	   |  누구나 접근이 가능
	 */

	public static void main(String[] args) {
		
		new PayController().execute();
		
	}
	
}
