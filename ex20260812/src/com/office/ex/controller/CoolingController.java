package com.office.ex.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.office.ex.system.CoolingSystem;

// 4번 객체 의존성
public class CoolingController {

	private CoolingSystem coolingSystem;
	
	public CoolingController(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
		
		
	}
	
// 7번
	public void control() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("Choose thee function you want.");
			System.out.println("1.Power on/off     2.Temperature setting     3.The end");
			
			int selectedFunction = scanner.nextInt();
			
			switch (selectedFunction) {
			case 1:
				/*
				boolean currentStatus = coolingSystem.isPower();
			
				if (currentStatus) {
					coolingSystem.setPower(false);
				} else {
					coolingSystem.setPower(true);
				}
				*/
				
				coolingSystem.setPower(!coolingSystem.isPower());
				break;
			
			case 2:
				
				System.out.println("Enter the desired temperature.");
				int desiredTemperature = scanner.nextInt();
				
				coolingSystem.setTargetTemperature(desiredTemperature);
				
				break;
				
			case 3:
	
				systemFlag = false;
				
				break;

			}
			
			coolingSystem.printSystemInformation();
			
		}
		
		scanner.close();
		
	}
	
}
