package day02;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("층을 입력하세요 : ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("약국입니다.\n");
			break;
		case 2:
			System.out.println("정형외과입니다.\n");
			break;
		case 3:
			System.out.println("피부과입니다.\n");
			break;
		case 4:
			System.out.println("치과입니다.\n");
			break;
		case 5:
			System.out.println("헬스클럽입니다.\n");
			break;
		}
	}
}
