package day04;

public class Cat {
	
	// OOP 특징
	
	// 1. 추상화.. has-a (Cat has a ??)
	// 2. 은닉화 (private)
	private String name;
	String breeds;
	double weight;
	
	// 생성자 함수
	public Cat() {
		
	}
	
	// 생성자 오버로딩 : 이름이 같은 생성자.. 
	// 단, 매개변수의 타입과 개수는 달라야 한다.
	public Cat(String name, String breeds, double weight) {
		this.name = name;
		this.breeds = breeds;
		this.weight = weight;
	}
	
	public Cat(String name, String breeds) {
//		this.name = name;
//		this.breeds = breeds;
		this(name, breeds, 20.0);
	}
	
	public Cat(double weight) {
//		this.weight = weight;
		this("야용이", "페르시안종", weight);
	}
	
	// 사용자 메소드
	void claw() {
		
	}
	
	// 사용자 메소드
	void meow() {
		
	}
	
	// 모든 고야이의 정보를 출력하는 메소드
	void catInfo() {
		System.out.println("이름 : " + name + "종 : " + breeds + "몸무게 : " + weight);
	}
	
	String catInfo2() {
		String info = "이름 : " + name + "종 : " + breeds + "몸무게 : " + weight;
		return info;
	}
	
	// 이름 변경 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// 이름 확인 메소드
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
	}

}
