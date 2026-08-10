package com.office.example;

public class Car {

	// 맴버 필드
	int length;	       // 길이
	int price;         // 가격
	int displacement;  // 배기량
	
	public Car() {
		System.out.println("--- Default Constructor ---");
		
		
	}
	
	// 생성자 오버로딩
	public Car(int length, int price, int displacement) {
		System.out.println("--- Default Constructor ---");
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
		
	// 메서드 선언
//	public 접근제한자
//	void(무시한다) 반환하는 타입이 없을경우
//	반환되는 타입이 있을 경우 반환되는 데이터타입을 명시하면된다
	public void goForward(int speed) {   // 동사 + 명사
		System.out.println(speed + "km/h goForward() CALLED!!");
		
	}
	
	public void goForward() {   // 동사 + 명사
		System.out.println("km/h goForward() CALLED!!");
		
	}
	
	public void goBack() {
		System.out.println("goBack() CALLED!!");
	}
	
	public void doStop() {
		System.out.println("doStop() CALLED!!");
	}
	
	public void testDrive() {
		goForward();
		goBack();
		doStop();
	}
	
	public void printCarSpec(String language) {
		if (language.equals("kor")) {
			printCarSpecForKor();
		} else {
			printCarSpecForEng();
		}
	}
	
	
	public void printCarSpec() {
		System.out.println("길이: " + this.length);
		System.out.println("가격: " + this.price);
		System.out.println("배기량: " + this.displacement);
	}
	
	// 다국어(kor || eng)
	private void printCarSpecForKor() {
		System.out.println("길이: " + this.length);
		System.out.println("가격: " + this.price);
		System.out.println("배기량: " + this.displacement);
	}
	
	private void printCarSpecForEng() {
		System.out.println("length: " + this.length);
		System.out.println("price: " + this.price);
		System.out.println("displacement: " + this.displacement);
	}
	
	// 거리 = 시간 * 속도
	// printDistane()
	// 반환되지 않을떈 void 반환받을땐 데이터타입을 명시한다.
	public float getDistance(int hour, int speed) {
		// System.out.println("이동 거리: " + (hour * speed) + "km/h");
		float distance = hour * (float) speed;
		
		// return 은 반환되는 기능도 있지만 멈추는 기능도 있다
		return distance;
		
//		System.out.println("메서드 실행 끝~~~~");  /오류
		

	}
}
