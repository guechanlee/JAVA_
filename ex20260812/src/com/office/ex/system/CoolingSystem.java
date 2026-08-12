package com.office.ex.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoolingSystem {
	
	
		// 1번 속성
		private boolean power;      		// 전원(외부 접근 불가)
		private int targetTemperature; 		// 희망 온도(외부 접근 불가)
		private String dateOfManufacture;	// 제조일(외부 접근 불가)
		private String color;				// 색상(외부 접근 불가)
		
		
		
		// 2번 생성자 오버로딩
		public CoolingSystem(String color) {
			
			power = false;
			targetTemperature = 18;
			dateOfManufacture = getSystemDateTime(); 
			
			this.color = color;
		}
		
		// 기능(메서드)
		// 에어컨의 전체 정보를 출력하는 메서드
		public void printSystemInformation() {
			
			System.out.println("=========== SystemInformation ===========");
			System.out.println("Power: " + isPower());   // 메서드를 통해 들어가자
			System.out.println("TargetTemperature: " + getTargetTemperature());
			System.out.println("DateOfManufacture: " + getDateOfManufacture());
			System.out.println("Color: " + getColor());
			System.out.println("==========================================");
			
			
			
		}
		
		/*
		// name convention
		// 조회 = get(getter)
		public int getTargetTemperature() {
			return this.targetTemperature;
		}
		
		// 설정 = set(setter)
		public void setTargetTemperature(int targetTemperature) {
			this.targetTemperature = targetTemperature;
		}
		*/
		
	
		
		
		// get,set 6번
		public boolean isPower() {
			return power;
		}

		public void setPower(boolean power) {
			this.power = power;
		}
		
	
		// 데이터를 조회하기 위해서(반환)
		public int getTargetTemperature() {
			return targetTemperature;
		}
		
		// 데이터를 설정하기 위해서
		public void setTargetTemperature(int targetTemperature) {
			
			if (!power) power = true;
			
			if (targetTemperature < 18) {
				targetTemperature = 18;
				
			} else if (targetTemperature > 30) {
				targetTemperature = 30;
			}
			
			this.targetTemperature = targetTemperature;
		}

		public String getDateOfManufacture() {
			return dateOfManufacture;
		}

//		public void setDateOfManufacture(String dateOfManufacture) {
//			this.dateOfManufacture = dateOfManufacture;
//		}

		public String getColor() {
			return color;
		}

//		public void setColor(String color) {
//			this.color = color;
//		}

		
		// 3번 시간 메서드 만들기
		private String getSystemDateTime() {
		
			LocalDateTime now =
					LocalDateTime.now();		// 현재 시스템의 날짜와 시간 구하기
			String dateTime =
					now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); // 날짜와 시간 형식을 맞춤

			return dateTime;
		}

	
		 	
}
