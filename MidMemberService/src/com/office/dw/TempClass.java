package com.office.dw;

import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;

public class TempClass {

	private static final String HashMap = null;

	public static void main(String[] args) {
		
		/*
		 *  	  제네릭 타입
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// 데이터추가
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// 데이터 조회
		nums.get(0);
		nums.get(1);
		nums.get(2);
		
		// 데이터 삭제
		nums.remove(0);
		nums.remove(1);
		nums.remove(2);
		
		// 크기 조회
		nums.size();
		
		//------------ Vector------------------
		Vector<Integer> nums2 = new Vector<Integer>();
		
		// 데이터추가
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		
		// 데이터 조회
		nums2.get(0);
		nums2.get(1);
		nums2.get(2);
		
		// 데이터 삭제
		nums2.remove(0);
		nums2.remove(1);
		nums2.remove(2);
		
		// 크기 조회
		nums2.size();
		*/
		
		/*
		 * dic == Map == HashMap
		 */
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// 데이터 추가
		hashMap.put(1, "박찬호");
		hashMap.put(2, "박지성");
		hashMap.put(3, "박세리");
		
		System.out.println(hashMap.get(1));		// 박찬호
		System.out.println(hashMap.get(2));		// 박지성
		System.out.println(hashMap.get(3)); 	// 박세리

		// 데이터 삭제
		hashMap.remove(1);
		System.out.println(hashMap.get(1));		// null
		
		// 크기 조회
		System.out.println(hashMap.size()); 	// 2
		
		// 전체 삭제
		hashMap.clear();
		System.out.println(hashMap.size());     // 0
		
		// value 변경
		hashMap.put(1, "박찬호");	  			// 박길동
		hashMap.put(2, "박지성"); 
		hashMap.put(3, "박세리");
		
		hashMap.put(1, "박길동");
		System.out.println(hashMap.get(1));   // 박길동
		
	}
	
}
