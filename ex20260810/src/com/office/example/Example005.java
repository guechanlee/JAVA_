package com.office.example;

import java.util.ArrayList;
import java.util.Iterator;
public class Example005 {

	public static void main(String[] args) {
		
		//1. 학생 등록 - 3명
		//3명의 학생을 어떻게 관리할까? -> ArrayList
		ArrayList<DWStudent> dwStudents = new ArrayList<DWStudent>();
		
		DWStudent student01 = new DWStudent("박찬호", 20);
		dwStudents.add(student01);
		
		DWStudent student02 = new DWStudent("박지성", 25);
		dwStudents.add(student02);
		
		DWStudent student03 = new DWStudent("박세리", 26);
		dwStudents.add(student03);
		
		// 박지성 학생 정보를 찾기 위해선
		
		for (int i = 0; i < dwStudents.size(); i++) {
			DWStudent dwStudent = dwStudents.get(i);    // 0 ==> student01
			if (dwStudent.name.equals("박지성")) {
				System.out.println("이름: " + dwStudent.name);
				System.out.println("나이: " + dwStudent.age);
			}
		}
		
	}
	
}
