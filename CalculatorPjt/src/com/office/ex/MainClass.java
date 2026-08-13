package com.office.ex;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
//		calculator.addCal(10, 20);
//		calculator.subCal(10, 20);
//		calculator.mulCal(10, 20);
//		calculator.divCal(10, 20);
		
		calculator.cal(new AddCal(), 10, 20);
		calculator.cal(new SubCal(), 10, 20);
		
	
	}

	
}
