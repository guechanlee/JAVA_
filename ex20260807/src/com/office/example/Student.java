package com.office.example;

public class Student {
	
	// 생성자 (디폴트 , 클래스로부터 객체를 생성할때 객체를 생성해주는 역할을 한다.)
	public Student() {
		System.out.println("^^^^^^^^^^^^^^^");
	}
	
	// 멤버 필드
	int id;
	String name;
	
	// 메서드
	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
	
}
