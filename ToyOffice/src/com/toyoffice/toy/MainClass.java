package com.toyoffice.toy;

public class MainClass {

	public static void main(String[] args) {
		
//		Teddybear teddybear = new Teddybear();
//		teddybear.doWalk();
//		teddybear.doSpeach();
//				
//		Robot robot = new Robot();
//		robot.doWalk();
//		robot.doSpeach();
		
		IToy teddybear = new Teddybear();
		teddybear.doWalk();
		teddybear.doSpeach();
		
		IToy robot = new Robot();
		robot.doWalk();
		robot.doSpeach();
		
		AirPlane airPlane = new AirPlane();
		
		
		IToy[] iToys = {teddybear, robot, airPlane};
		for (int i = 0; i < iToys.length; i++) {
			iToys[i].doWalk();
		}
		
	}
	
}
