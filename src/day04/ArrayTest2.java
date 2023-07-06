package day04;

import java.awt.image.AreaAveragingScaleFilter;
import java.time.temporal.WeekFields;

/*
문제1 :
이번 한 주간 사관학교스터디에 접속한 사용자 수는 아래와 같다.
월 : 581명
화 : 512명
수 : 527명
목 : 495명
금 : 423명
토 : 141명
일 : 236명
하루 평균 접속자를 출력 예와 같이 구하도록 average() 메소드를 완성하시오
----------------------
출력 예
----------------------
하루 평균 사용자 : 416.43명
----------------------
*/

public class ArrayTest2 {
	
	
	public static double average(int[] week) {
		double sum = 0;
		for (int i = 0; i < week.length; i++) {
			sum += week[i];
		}
		return sum / week.length;
	}
	
	public static void main(String[] args) {
		int[] week = { 581, 512, 527, 495, 423, 141, 236 };
		System.out.printf("%.2f", average(week));
	}
}
