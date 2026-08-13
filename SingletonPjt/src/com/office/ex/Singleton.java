package com.office.ex;

public class Singleton {

	private static Singleton singleton;
	private int count = 0;
	
	
	private Singleton() {}
		
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
	}
		
		return singleton;
		
	}

	public void increseCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

		
}
