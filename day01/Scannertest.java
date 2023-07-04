package day01;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Scannertest {
	
	// 입력받는 멤버 변수 선언 (이름, 나이, 전화번호)
	static String name;
	int age;
	String tel;
	
	// 생성자
	public Scannertest() {
		
	}
	
	// 모든 멤버 변수 출력하는 메소드 정의하기
	public void showMember() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 연락처 : " + tel);
	}
	
	
	public static void main(String[] args) {
		// Scanner 객체 생성하기
		Scanner scan = new Scanner(System.in);
		Scannertest st = new Scannertest();
		System.out.print("이름을 입력해주세요:");
		Scannertest.name = scan.next();
		System.out.print("나이를 입력해주세요:");
		st.age = scan.nextInt();
		System.out.print("전화번호를 입력해주세요:");
		st.tel = scan.next();
		
		st.showMember();
	}
}
