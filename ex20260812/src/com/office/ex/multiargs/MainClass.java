package com.office.ex.multiargs;

public class MainClass {

	public static void main(String[] args) {
		
		Score score = new Score();
//		score.printStudentsTotalAndAvergeScore(80, 90, 100);
//		score.printStudentsTotalAndAvergeScore(80, 90, 100, 80);
		
		score.printStudentsTotalAndAvergeScore(3, 80, 90, 100);
		
		// 길동이가 사용하고 싶다. 총합 과 평균
		
		/* 
		 * Score score2 = new Score();
		 * int[] scores = {10, 20, 30};
		 * score2.getTotalScore(scores);
		 * score2.getAverageScore(scores);
		 */
		
		int[] scores = {10, 20, 30};
		TotalAverage.getAverageScore(scores);
		TotalAverage.getTotalScore(scores);
	}
	
}
