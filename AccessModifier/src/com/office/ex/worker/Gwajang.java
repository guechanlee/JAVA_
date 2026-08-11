package com.office.ex.worker;

public class Gwajang {

	public String name = "Kim Gwajang";
	public int money;
	
	public Gwajang() {
		money = 2000000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "지급 완료!!");
	}
	
}
