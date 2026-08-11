package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.runner.Rabbit;
import com.office.ex.runner.Turtle;
import com.office.ex.service.GameService;

public class GameController {
	
	public void execute() {

	new GameController().execute();
	GameController gameController = new GameController();
		
		Scanner scanner = new Scanner(System.in);
		int selectedNumber = scanner.nextInt();
		
		switch (selectedNumber) {
		case 1:			// run
			gameService.run();
			break;

		case 2:			// stop
			gameService.run();
			break;
		}
		scanner.close();
		
	}
	  

}
