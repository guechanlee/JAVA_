package com.office.example;

public class ClassEx001 {

	public static void main(String[] args) {
		// new Cat -> Cat class -> Cat 객체 생성
		
//		--------------사진---------------
		// Cat class 내가 만든 데이터 타입이다
		//cat1의 레퍼런스 변수에 데이터 타입은 Cat이다
		Cat cat1 = new Cat(); 	// 객체 생성 at 메모리
		
		System.out.println("cat1: " + cat1);
		//.도트접근자(연결)
		System.out.println(cat1.breed);
		
//		------------사진--------------
		cat1.eat();
		
		Person person1 = new Person();
		
		person1.walk();
		person1.walkForEng();
		
		System.out.println(person1.name);
		System.out.println(person1.regNum);
		System.out.println(person1.setAtrribute);
	}
}
