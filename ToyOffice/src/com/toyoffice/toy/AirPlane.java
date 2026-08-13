package com.toyoffice.toy;

public class AirPlane implements IToy {


	
//	// 걷다
//	public void walk() {
//		System.out.println("[AirPhane] walk()");
//	}
//	
//	//말하다
//	public void speach() {
//		System.out.println("[AirPhane] speach()");
//	}

	@Override
	public void doWalk() {
		System.out.println("[AirPhane] walk()");
	}

	@Override
	public void doSpeach() {
		System.out.println("[AirPhane] speach()");
	}
}
