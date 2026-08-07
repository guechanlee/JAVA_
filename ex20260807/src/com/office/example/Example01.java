package com.office.example;

import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
//		cat.breed = "페르시안 고양이";
		cat.color = "흰색";
		
		System.out.println("cat.breed: " + cat.breed);
		System.out.println("cat.breed: " + cat.color);
		System.out.println("cat.breed: " + cat.age);
		
		cat.eat();
		
		cat.eatStatic();
		
		Cat.eatStatic();
		
		int[] nums = {10, 20, 30};
		// Arrays arrays = new Arrays()
		// arrays.toString
		System.out.println(Arrays.toString(nums));
		
		//static은 객체를 사용하지안고도 메서드를 사용할 수 있다.
		//static를 많이 쓰게되면 객체지향적인 설계와 멀어질 수 있다.
		
		cat.breed = "^^";
	}
		
}
