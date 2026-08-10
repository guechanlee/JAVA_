package com.office.example;

public class Example002 {

	public static void main(String[] args) {
		
//		// 1학년 학생
//		// 1학년, 1반, 5번, "박찬호", false
//		OurStudent ourStudent01 = new OurStudent();
//		ourStudent01.grade = 1;
//		outStudent01.classNo = 1;
//			outStudent01.studentNo = 5;
//		ourStudent01.studentName = "박찬호";
//			ourStudent01.absence = false;
//			
//		ourStudent01.printInfo();
//		
		
		
		
//		OurStudent ourStudent01 = new OurStudent(1, 1, 2, "박찬호", false);
//		ourStudent01.printInfo();
//		
//		OurStudent ourStudent02 = new OurStudent(1, 2, 5, null, false);
//		ourStudent01.printInfo();
		
		OurStudent ourStudent01 = new OurStudent(2, 5, "박찬호");
		ourStudent01.printInfo();
		
		OurStudent ourStudent02 = new OurStudent(2, 5, "박지성");
		ourStudent02.printInfo();
		
		// 박세리 학생 2학년 전학
		OurStudent ourStudent03 = new OurStudent(2, 5, "박세리");
		ourStudent03.printInfo();
		
	}

}
