package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.service.PayService;

public class PayController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the month: ");
		int thisMonth = scanner.nextInt();
		
		PayService payService = new PayService();
		payService.pay(thisMonth);
		
		scanner.close();
		
	}
	
}
