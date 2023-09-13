package Lv3.퀘스트;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// 클래스 객체 생성 (2명)
		// 학생 값을 입력 후, 이름(나이) 전화번호 출력
		Student std1 = new Student("아이언맨",40,"010-1111-1111");
		Student std2 = new Student("헐크",37,"010-2222-2222");
		Student std3 = new Student();
		
		// print메소드로 출력
		std1.print();
		// print메소드 안쓰고 toString으로 출력
		System.out.println(std2);
		
		// 학생 값 직접 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("-----학생추가-----");
		System.out.print("학생명: ");
		std3.setName(scan.next());
		System.out.print("나이: ");
		std3.setAge(scan.nextInt());
		System.out.print("전화번호: ");
		std3.setPhone(scan.next());
		
		scan.close();
		System.out.println("-------------");
		
		System.out.println(std3);

	}

}
class Student {
	// 멤버변수
	// 이름, 나이, 전화번호, 주소
	private String name;
	private int age;
	private String phone;
	private String address;
	
	
	// 생성자
	public Student() {}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public void print() {
		System.out.println(name + "(" + age + ") phone: " + phone);
	}

	//getter/setter 단축키 : Alt + Shift + S > R
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// toString
	@Override
	public String toString() {
		return name + "(" + age + ") phone: " + phone;
	}
	
	
}


