package day03;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		System.out.print("몇단의 구구단을 입력할지? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %2d\n", num, i, num * i);
		}
	}
}
