package com.office.ex.worker;

public class Chajang {

	public String name = "Kim Chajang";
	public int money;
	
	public Chajang() {
		money = 3000000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "지급 완료!!");
	}
	
}
