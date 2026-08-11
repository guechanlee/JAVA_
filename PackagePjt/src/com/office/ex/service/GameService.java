package com.office.ex.service;

import com.office.ex.runner.Rabbit;
import com.office.ex.runner.Turtle;

public class GameService {

	Turtle turtle = new Turtle();
	Rabbit rabbit = new Rabbit();
	
	public void run() {
		turtle.run();
		rabbit.run();
	}
	
	public void stop() {
		turtle.stop();
		rabbit.stop();
	}
	
}
