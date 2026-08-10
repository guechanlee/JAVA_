package com.office.example;

import java.util.ArrayList;

public class Example004 {

	public static void main(String[] args) {
		
		// ArrayList, HashMap에 대해서 알아봅시다.  ==> 컨테이너(Container) 자료형
		
		// ArrayList는 Array과 비슷하다. Array 단점을 보완하기 위해서 탄생한 클래스이다.
		// HashMap는 Python의 딕셔너리({key, value})와 비슷하다.
		
		// ArrayList 사용 방법 **********************************
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		// [10, 20, 30, 40, 50]
		
		// 크기 조회
		System.out.println(nums.size());  	// 방의 개수: 3
		
		// 데이터 조회
		System.out.println(nums.get(0));    // 인덱스 0에 해당하는 데이터 조회
		System.out.println(nums.get(1));    // 인덱스 1에 해당하는 데이터 조회
		System.out.println(nums.get(2));    // 인덱스 2에 해당하는 데이터 조회
		
		//전체 데이터 조회
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// 데이터 삭제
		nums.remove(3);   // [10, 20, 30, 40, 50]  =>  [10, 20, 30, 50]
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// 데이터 수정
		nums.set(1, 200);
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		// 전체 데이터를 삭제 <-------------ArrayList 객체는 살려두고 그안의 정수 데이터만 몽땅 제거
		nums.clear();
		System.out.println("nums.size(): " + nums.size());     // 0
		
		//ArrayList 객체 제거 at 메모리
		System.out.println("nums: " + nums);   // 메모리 주소 for ArrayList 객체
		nums= null;    	
		System.out.println("nums: " + nums);   // null
	}

}
