package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1 == singleton2); // true
		
		singleton1.increseCount();   // count: 1
		singleton1.increseCount();   // count: 2
		System.out.println(singleton1.getCount());  // 2
		
		singleton2.increseCount();   // 3
		System.out.println(singleton1.getCount());  // 3
	}
	
}
