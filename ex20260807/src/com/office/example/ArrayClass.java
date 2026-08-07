package com.office.example;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		/*
		 * ㅡㅡㅡㅡㅡㅡㅡㅡ배열 복사하는 사진 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 변수는 배열의 첫번째 값을 얻는다
		 * 메모리상  int형은 4byte임으로 4칸을 차지 한다
		 * 인덱스 0부터 시작
		 */

		// 초기화 하지 않는 배열
		int[] nums = new int[5];
		System.out.println("num[0]: " + nums[0]);
		System.out.println("num[1]: " + nums[1]);
		System.out.println("num[2]: " + nums[2]);
	 
		// 배열생성하고 초기화하지 않으면 배열안에 0을 넣는다. 
		//정수 -> 0
		//실수 -> 0.0
		//논리형 -> false
		for (int num : nums) {
			System.out.println("num: " + num);
		}
		
		float[] floats = new float[3];
		for (float f : floats) {
			System.out.println("f: " + f);
		}
		
		boolean[] flags = new boolean[3];
		for (boolean b : flags) {
			System.out.println("b: " + b);
		}
		
		// 배열 복사
		// 기초 데이터 타입은 값이 저장이 된다(깊은 복사)
		int number1 = 10;
		int number2 = 20;
		
		System.out.println("number1: " + number1);   // 10
		System.out.println("number2: " + number2);   // 20
		
		number2 = number1;
		System.out.println("number2: " + number2);   // 10
		
		// 레퍼런스 데이터 타입은 메모리 주소가 저장이 된다(얕은 복사)
		int[] numbers1 = {10, 20, 30};    // [10    20    30]
		int[] numbers2 = {100, 200, 300}; // [100   200    300]
		
		System.out.println("numbers1: " + Arrays.toString(numbers1));
		System.out.println("numbers2: " + Arrays.toString(numbers2));
		
		numbers2 = numbers1;
		
		System.out.println("numbers2: " + Arrays.toString(numbers2));
		// 동일한 주소
		System.out.println("numbers1 ADDR: " + numbers1);
		System.out.println("numbers2 ADDR: " + numbers2);
		
		// 주소가 동일하기 때문에 하나만 수정해도 동일하게 수정된다
		numbers2[2] = 999;
		System.out.println(numbers1[2]);
		
		// 배열 삭제
		int[] scores = {80, 90, 100};
		System.out.println(Arrays.toString(scores));   // [80, 90, 100]
		System.out.println(scores);                    // 메모리 주소
		
		// null 배열과의 관계를 끊는 함수
		// 자바에서 GC를 강제로 사용하는 방법 System.gc();
		// 가비지 콜렉터이 연결이 끊어진 배열을 찾게 되면 메모리에서 삭제합니다.
		// 한번 연결이 끊긴 배열은 복구가 불가합니다
		scores = null;          // {80, 90, 100} 회수 by GC     0.001
//		System.gc();            // 사실 아무런 의미가 없다 강제로 실행시키는것이 아닌 요청을 하는거다
		System.out.println(scores);                    // null
		
		//배열의 길이는 변경할 수 없다.
		//배열은 최초 생성될 때 길이를 설정하고 이후 배열의 크기를 수정할 수 없다.
		
		
		/* 다차원 배열
		 다차원 배열은 2차원,3차원~~ n차원 배열로 개발자가 원하는 만큼 선언할 수 있습니다.
		하지만 일반적으로 2차원 배열까지만 사용하고 3차원 이상의 배열은 사용하지 않습니다.
		이유는 배열을 사용하는 이유가 비슷한 데이터를 묶어서 보다 효율적으로 데이터를 관리하기 위해서인데 3차원이상부턴 관리가 어려워진다.
		
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ다차원 배열 그림 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		2차원배열은 배열안에 또 다른 배열을 가리키는 배열 주솟값이 저장된다.
		int[][]mns =
		*/
	}

}
