package com.office.ex;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 예외 처리(Exception)
		 * 문제는 에러(예외)가 발생했을 때 시스템 절대로 멈추면 안된다.
		 * 예외가 발생했을 때 어떻게 하면 시스템이 멈추지 않고 계속 진행되게 만들까? 를 개발자 고민해야함.
		 * 그래서 예외가 발생을 하게 되면 예외는 따로 처리를 하게 해야하고, 시스템은 계쏙 실행(유지)되어야 함.
		 */
		
		/* 
		 * '예외'하고 '에러'를 일반적으로 동일한 의미로 사용한다.
		 * 
		 */
		int num1 = 10;
		int num2 = 0;
		
		
		// try ~ catch
		System.out.println("num1 + num2 = " + (num1 + num2));			// OK
		
		try {
			// 실행 구문 - 출근
			System.out.println("num1 / num2 = " + (num1 / num2));			// ERROR
			
		} catch (ArithmeticException e) {    // ArithmeticException child   // Exception 에러의 최상단
			// 예외가 발생했을 떄 예외를 처리하는 구문 - 보험사 업무
			System.out.println("예외 발생!!");
			System.out.println(e.getMessage());
			e.printStackTrace();  
			
		}
			
		catch (Exception e) {    // ArithmeticException child   // Exception 에러의 최상단
			// 예외가 발생했을 떄 예외를 처리하는 구문 - 보험사 업무
			System.out.println("예외 발생!!");
//			System.out.println(e.getMessage()); by zero
			e.printStackTrace();
			
			
		} finally {
			// 예외가 발생허든 안하든 무조건 실행하는 구문
			System.out.println("나는 무조건 실행할거야~");
		}
		
		
		System.out.println("num1 - num2 = " + (num1 - num2));			// OK
		System.out.println("num1 * num2 = " + (num1 * num2));			// OK
		
		Scanner scanner = new Scanner(System.in);
		
		scanner = null;
		
		scanner.close();
	}
	
}