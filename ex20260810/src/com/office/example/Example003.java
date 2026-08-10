package com.office.example;

public class Example003 {

	public static void main(String[] args) {
		 
//		메서드 호출부
		Car car01 = new Car(500, 1000, 2000);
//		car01.goForward();
//		car01.goBack();
//		car01.doStop();
		
		car01.testDrive();
		
//		System.out.println(car01.length);
//		System.out.println(car01.price);
//		System.out.println(car01.displacement);
		
		car01.printCarSpec();
		
		car01.goForward();
		car01.goForward(50);
		
		float result = car01.getDistance(2, 30);
		System.out.println("이동 거리: " + result);
		

	}
	
}
