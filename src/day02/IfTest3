package day02;

import java.awt.GridBagConstraints;
import java.util.Scanner;

/*
	놀이공원 입장료 계산하기.
	8살 미만은 1000원, 초등학생 14살 미만은 2000원
	중고등학생 20살 미만은 2500원, 그 이상은 3000원
	age 변수, charge 변수
*/

public class IfTest3 {
	
	// 변수
	int age, charge;
	
	// 생성자
	public IfTest3() {
		
	}
	
	// 메소드
	
	
	
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학전 아동입니다.\n");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.\n");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는 " + charge + "입니다.\n");
	}
}
