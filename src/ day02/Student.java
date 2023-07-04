package day02;

public class Student {

	// 속성
	String name;
	int num;
	int age;
	
	// 생성자
	public Student() {
		name = "정명환";
		num = 20201513;
		age = 24;
	}
	
	// 생성자 오버로딩
	public Student(String name, int num, int age) {
		this.name = name;
		this.num = num;
		this.age = age;
	}
	
	// 메소드
	public void showAll() {
		System.out.printf("이름 : %s, 학번 : %d, 나이 : %d\n", name, num, age);
	} // C언어에서처럼 printf포맷 지원함.
	
	public void setName(String name) { // 이름 변경 메소드
		this.name = name;
	} // void 반환 타입 = return 없어야함.
	
	public String getName() { // 이름 출력 메소드
		return name;
	} // String 반환 타입 = return 있어야함.
	
	
	// 이클립스 환경에서 실행 단축키 = Ctrl + F11
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.showAll();
		// 이름 : 정명환, 학번 : 20201513, 나이 : 24
		
		Student student2 = new Student("이길동", 20111111, 22);
		student2.showAll();
		// 이름 : 이길동, 학번 : 20111111, 나이 : 22 
		// Student student2 = new Student();로 하게 되면
		// 객체 student1과 객체 student2의 출력값이 동일하다
		// 그래서 생성자 오버로딩을 통해 매개변수가 다른 생성자를 선언한다.
		
		

	}

}
