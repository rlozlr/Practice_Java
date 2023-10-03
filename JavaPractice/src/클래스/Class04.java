package 클래스;

public class Class04 {

	public static void main(String[] args) {
		Student s = new Student("인천","홍길동","자바","1111");
		// 객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(s);
		Student s1 = new Student();
		System.out.println(s1);

	}

}

/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자
 * 메서드 : 출력(print메서드) =>toString메서드
 * getter/setter
 * */

/* 객체를 초기화 하는 방법 : 기본값(null, 0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2. 초기화 블럭 : { } 멤버변수를 초기화
 * 3. 생성자 : 객체들 초기화하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * */


class Student {
	private String branch="서울";
	private String name="미상";
	private String className;
	private String phone;
	
	{
		// 초기화 블럭
		branch="seoul";
		className="미정";
	}
	
	// 생성자
	public Student () { }

	public Student(String branch, String name, String className, String phone) {
		this.branch = branch;
		this.name = name;
		this.className = className;
		this.phone = phone;
	}
//	public void print() {
//	System.out.println(branch+" "+name+" "+className+" "+phone);
//}

// toString으로
	@Override
	public String toString() {
		return "Student [branch=" + branch + ", name=" + name + ", className=" + className + ", phone=" + phone
				+ "]";
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBan() {
		return className;
	}

	public void setBan(String ban) {
		this.className = ban;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}