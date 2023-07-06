package day03;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		System.out.print("0부터 n까지 더한 값을 구할 때, n을 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i += 2) {
			sum += i;
			System.out.println(i + "까지의 총합은 " + sum);
		}
	}
}
