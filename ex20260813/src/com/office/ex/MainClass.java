package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		// 상속(Inheritance) == 인간세계의 '상속'과 동일하다.
		// ParentsClass가 ChildClass한테 상속(속성, 기능)을 할 수 있다.
		
		Parentclass childClass = new ChildClass();
		childClass.print();
		
		Parentclass[] parentClasses = {childClass};
		
	}
	
}
