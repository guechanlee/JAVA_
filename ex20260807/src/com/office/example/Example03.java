package com.office.example;

public class Example03 {

	public static void main(String[] args) {
		
		Student student01 = new Student();
		
		student01.insertRecord(20221004, "홍길순");
		student01.printInfo();
		
		Student student02 = new Student();
		
		student02.insertRecord(20221005, "홍길동");
		student02.printInfo();
		
		Student student03 = new Student();
		
		student03.insertRecord(20221006, "홍길자");
		student03.printInfo();
	}
	
}
