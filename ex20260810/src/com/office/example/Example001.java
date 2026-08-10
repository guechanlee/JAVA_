package com.office.example;

public class Example001 {

	public static void main(String[] args) {
		
		/*
		 * 객체 초기화
		 * 클래스에서 생성된 객체의 초기화를 담당하는 메서드
		 */
		
		// 매게변수를 넣지 않을때 
		Student student00 = new Student();
		student00.printInfo();
		
		
		// 생성자 매개 변수  
		// 파라미터 타입과 갯수만 다르면 다양하게 만들 수 있다.
		Student student01 =  new Student("홍길동", 1, 20, "computer");
		student01.printInfo();

		Student student02 =  new Student("박찬호", 2, 21, "music");
		student02.printInfo();
		
		Student student03 =  new Student("박세리", 1, 20, "sport");
		student03.printInfo();
		
	
		
		
	}
	
}
