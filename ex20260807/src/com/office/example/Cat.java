package com.office.example;

public class Cat {
	
	// 멤버 변수 == 속성 == attribute == 멤버 필드
	static String breed;
	String color;
	int age = 10;
	
	// 일반 메서드
	// 멤버 메서드 == 기능 == method
	void eat() {
		System.out.println("eat() CALLED!!");
	}
	
	// 정적 메서드 == static method
	static void eatStatic() {
		System.out.println("eatStatic() CALLED!!");
	}
	
	void scratch() {
		
	}
	
	void meow() {
		
	}
}
