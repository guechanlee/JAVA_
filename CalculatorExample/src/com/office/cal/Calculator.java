package com.office.cal;

public class Calculator {

	CalculatorAdd calculatorAdd = new CalculatorAdd();
	CalculatorSub calculateSub = new CalculatorSub();
	CalculatorMul calculateMul = new CalculatorMul();
	CalculatorDiv calculateDiv = new CalculatorDiv();
	
	void calculateAdd(int n1, int n2) {
		System.out.println("[Calculate] calculateAdd() CALLED!!");
		
//		CalculatorAdd caculatorAdd = new CalculatorAdd();
		calculatorAdd.doOperate(n1, n2);
	}
	
	void calculateSub(int n1, int n2) {
		System.out.println("[Calculate] calculateSub() CALLED!!");
		
//		CalculatorSub caculatorSub = new CaculatorSub();
		calculatorSub.doOperate(n1, n2);
	}
	
	void calculateMul(int n1, int n2) {
		System.out.println("[Calculate] calculateMul() CALLED!!");
		
//		CalculatorMul calculatorMul = new CalculatorMul();
		calculatorMul.doOperate(n1, n2);
	}
	
	void calculateDiv(int n1, int n2) {
		System.out.println("[Calculate] calculateDiv() CALLED!!");
		
//		CalculatorDiv calculatorDiv = new CalculateDiv();
		calculatorDiv.doOperate(n1, n2);
	}
	
}
