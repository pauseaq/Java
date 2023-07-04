package day01;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Scannertest2 {
	
	// 두 스를 입력받아 더해 결과를 반환하는 클래스 멤버 변수 선언
	static int num1, num2, sum;
	
	// 생성자
	public Scannertest2() {
		
	}
	
	// 두 정수를 매개변수로 전달 받아 더한 결과를 반환하는 add() 메소드 정의
	public static int add(int num1, int num2) {
		sum = num1 + num2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1 : ");
		Scannertest2.num1 = scan.nextInt();
		System.out.println("정수2 : ");
		Scannertest2.num2 = scan.nextInt();
		System.out.println(add(num1, num2));
		
	}
}
