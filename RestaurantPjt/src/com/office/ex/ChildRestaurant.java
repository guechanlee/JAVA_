	package com.office.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class ChildRestaurant 
					extends PapaRestaurant
					implements IPapaRestaurant {

	static final int PAPA = 1;
	static final int ME = 2;
	
	//오버라이드(Override)
	//상위 클래스의 기능을 하위 클래스에서 기능을 재선언하는 것
	public void makeBokkeumbap(int family) {
		
//		ArrayList<String> arrayList = new ArrayList<String>();
		List<String> arrayList = new ArrayList<String>();
		
//		Vector<String> vector = new Vector<String>();
		List<String> vector = new Vector<String>();
		
		ArrayList<List<String>> list = new ArrayList<List<String>>();	
		list.add(arrayList);
		list.add(vector);
		// List<String>으로 데이터 총합
		
		arrayList.add("");
		vector.add("");
		
		switch (family) {
		case PAPA:
			super.makeBokkeumbap();
			break;

		case ME:
			System.out.println("[ChildRestaurant] makeBokkeumbap()");			
			break;

		}
//		super.makeBokkeumbap();
	}

	@Override
	public int makeTangsuyuk() {
		System.out.println("[ChildRestaurant] makeTangsuyuk()");
		return 0;	
	}

//	@Override
//	public void makeJajangmyeon() {
//		// TODO Auto-generated method stub
//		super.makeJajangmyeon();
//	}
	
	
}
