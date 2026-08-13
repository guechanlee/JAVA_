package com.toyoffice.toy;

public class Robot implements IToy {

	@Override
	public void doWalk() {
		System.out.println("Robot walk!!");
		
	}

	@Override
	public void doSpeach() {
		System.out.println("Robot doSpeach!!");
		
	}

}
