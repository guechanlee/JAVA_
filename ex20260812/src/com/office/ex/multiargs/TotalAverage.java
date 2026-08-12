package com.office.ex.multiargs;

public class TotalAverage {

	// 총점 전문가 메서드
			static public int getTotalScore(int[] scores) {
				
				int totalScore = 0;
				for (int i = 0; i < scores.length; i++) {
					totalScore += scores[i];
				}
				
				return totalScore;
			}

			// 평균 전문가 메서드
			static public float getAverageScore(int[] scores) {
				
				float averageScore = 0.0f;
				if (scores.length > 0) {
					averageScore = getTotalScore(scores) / scores.length;
				}
				return averageScore;
				
			}
	
}
