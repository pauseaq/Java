package day01;

public class Person { // 클래스 선언
	
	// 1. 멤버 변수 선언
	static String name;
	int age;
	String tel;	
	
	// 2. 생성자 정의
	public Person() {
		name = "홍길동";
		age = 3;
		tel = "010-456-4566";
	}
	
	
	// 3. 메소드 정의
	// (1) 반환타입이 없고, 이름을 매개변수로 받아서 새롭게 이름변수값을 변경하는 메소드 정의하기
	public static void setName(String nname) {
		name = nname;
	}
	
	// (2) 반환타입과 매개변수가 없는 모든 멤버 변수의 값을 출력하는 메소드 정의하기
	public void showMemberAll() {
		System.out.println("이름 : " + name + " / 나이 : " + age + " / 연락처 : " + tel);
	}
	
	public static void main(String[] args) {
		Person hong = new Person();
		hong.showMemberAll();
		Person.setName("이길동");
		hong.showMemberAll();

	}
}
