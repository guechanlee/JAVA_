package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 아빠 중식당. 메뉴 짜장면 짬뽕
		 */
		
		PapaRestaurant papaRestaurant = new PapaRestaurant();
		papaRestaurant.makeJajangmyeon();   // 짜장면
		papaRestaurant.makeJjamppong();     // 짬뽕
		
		/*
		 * 아빠 은퇴 중식당을 물려받기!
		 * 가게 새로 오픈!
		 */
		
		ChildRestaurant childRestaurant = new ChildRestaurant();
		childRestaurant.makeJajangmyeon();
		childRestaurant.makeJjamppong();
		
		papaRestaurant.makeBokkeumbap();
		childRestaurant.makeBokkeumbap();
		
		/*
		 * 근데, 아들이 볶음밥 맛을 보니까, 울 아빠 볶음밥이 마음에 들지 않는다.
		 * 오버라이드(Override, 재정의)
		 */
		
		/*
		 * 아빠가게 단골 손님이 오셔서 말하기를
		 * '아들아 나는 너꺼 말고 아빠꺼 볶음밥 먹고 싶단다'
		 */
		
		childRestaurant.makeBokkeumbap(ChildRestaurant.PAPA);
		childRestaurant.makeBokkeumbap(ChildRestaurant.ME);
		
	}
	
}
