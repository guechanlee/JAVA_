package com.office.ex.worker;

public class Daeri {

	public String name = "Kim Daeri";
	private int money;
	
	public Daeri() {
		money = 1000000;
	}
	
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "지급 완료!!");
	}
	
	public void setMoney(int money, String grade) {
		if (grade.equals("CEO"))
		this.money = money;
	}
}
