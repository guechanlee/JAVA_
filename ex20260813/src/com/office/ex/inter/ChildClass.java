package com.office.ex.inter;

public class ChildClass implements Parent, GrandParent {

	@Override
	public void doPrint() {
		System.out.println("^^");
		
	}

	@Override
	public void doRun() {}

	@Override
	public void doEat() {
		System.out.println("eat");
		
	}


	}


