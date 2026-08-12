package com.office.ex.multiargs;

public class Score {

	// 학생들의 시험점수를 출력
	// 총점 & 평점
	
	// 학생 3명
	/*
	public void printStudentsTotalAndAvergeScore(
			int score1,
			int score2,
			int score3) {
		
		int totalScore = score1 + score2 + score3;
		System.out.println("총점: " + totalScore);
		
		float averageScore = totalScore / 3;
		System.out.println("평균: " + averageScore);
		
		
		
	}
	
	public void printStudentsTotalAndAvergeScore(
			int score1,
			int score2,
			int score3,
			int score4) {
		
		int totalScore = score1 + score2 + score3 + score4;
		System.out.println("총점: " + totalScore);
		
		float averageScore = totalScore / 4;
		System.out.println("평균: " + averageScore);
	
	}
	*/
	
	public void printStudentsTotalAndAvergeScore(int classNo, int ...scores) {
	
		// 매게변수로 가변인자의 순서로 사용하는 것은 가능하지만 가변인자와 매게변수의 순서를 사용하는 것은 불가능하다
		// 즉 가변인자는 항상 맨뒤에 사용해야한다.
//		int totalScore = getTotalScore(scores);
//		for (int i = 0; i < scores.length; i++) {
//			totalScore += scores[i];

			
		System.out.println(classNo + "반 총점: " + TotalAverage.getTotalScore(scores));
		// 100 -> 3반 총점:
		
		
		System.out.println(classNo + "반 평균: " + TotalAverage.getAverageScore(scores));
		// 80.0  -> 3반 평점: 80
		
		}
		
		
 }


