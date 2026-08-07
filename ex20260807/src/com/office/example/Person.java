package com.office.example;

public class Person {

	// 속성
	String name;      // 멤버 변수 or 멤버 필드 -> 클래스 전체에서 사용 가능(객체가 살아있을때 계속 살아있다)
	int regNum;		  // 멤버 변수 or 멤버 필드
	int setAtrribute = setData();
			
	int setData() {
		name = "홍길동"; // 데이터 타입을 쓰면 지역변수가 되어서 전역변수랑 완전 무관하게 된다
		this.name = name; // 나자신의 맴버필드 
		regNum = 1000;
		
		return 0;
	}
	
	// 기능
	void walk() {
		System.out.println("걷다!");
		
		int regNum;     // 변수(일반) 함수 내에서만 사용가능한 변수(메서드가 종료되면 사라진다)
	}
	
	void walkForEng() {
		System.out.println("walk!");
	}
	
	void run() {
		
	}
}
