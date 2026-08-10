package com.office.example;

public class Student {

	
	// 순서 속성 -> 생성자 -> 기능
	
	// 속성 == 맴버 필드
	String name;		// null
	int grade;			// 0
	int age; 			// 0
	String major;		// null
	
	// '디폴트 생성자' 라고 한다.
//	public Student() {
//		
//	}
	
	
//	클래스로부터 객체를 만들 때 객체를 초기화하는 역할을 한다.
//	객체가 생성되면 생성자가 자동으로 호출된다.
//  속성(맴버 필드)도 초기화를 해준다
	// 생성자(Constructor)      <--- 기본 생성자(Default Constructor)
	public Student() {
		System.out.println("Student() Costructor CALLED!!");
		
		// 생성자를 이용한 초기화
		// ***** 이렇게 디폴트 생성자에서 맴버 필드를 초기화 하게되면
		//       이제 디폴트 생성자는 더이상 '디폴트 생성자'가 아니다.
		// 		 이제 부터는 '일반 생성자'라고 합니다.
		// 		 그러면 디폴트 생성자가 없으니, 컴파일러가 개발자를 대신해서
		//   	 디폴트 생성자를 넣어줄까?
		//		 아니다 일반생성자가 하나라도 존재하면, 넣어주지 않는다.
		name = "홍길동";
		grade = 1;
		age = 20;
		major = "computer";
		
	}
	

	// 생성자 매개 변수 ==> 일반 생성자 ==> 생성자 오버로딩(overloading, 과적)
	// 생성자 오버 로딩 -> 남들이 쓰기 편하게 만들어준다
	// 매게변수 이름은 가독성이 뛰어난 이름으로 만들기 == 속성명과 동일하게 하자
	// this는 지역내의 변수가 아닌 전역변수에 값을 할당할 때 사용한다.(속성명과 같아서 오류날때)
	public Student(String name, int grade, int age, String major) {
		System.out.println("Student() CALLED!!");
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
	}
	
	
	
	// 기능 == 맴버 메서드
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Age: " + age);
		System.out.println("Major: " + major);
	}
	
	
}
