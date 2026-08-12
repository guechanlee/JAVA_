package com.office.ex.overloading;

public class Greet {
	
	/*
	public void printGreetword() {
		System.out.println("안녕하세요.");
	}
	
	public void printGreetWordByName(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	*/
	
	
	public void printGreetword() {
		System.out.println("안녕하세요.");
	}
	
	public void printGreetWord(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	
	public void printGreetWord(char c) {
		System.out.println(c + "님 안녕하세요.");
	}
	
	public void printGreetWord(String name, String word) {
		System.out.println(name + "님 " + word);
	}
}
