package com.office.ex.overloading;

public class MainClass {

	public static void main(String[] args) {
		
		Greet greet = new Greet();
		
//		greet.printGreetword();
//		greet.printGreetWordByName("박찬호");
		
		greet.printGreetword();
		greet.printGreetWord("박찬호");
	}
	
}
