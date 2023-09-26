package Lv3.수강관리프로그램;

public class ComputerCourse {
	/* 수강관리 프로그램
	* - ComputerCourse 클래스 생성
	* - 학생의 기본정보 : 이름, 생년월일, 나이, 전화번호
	* - 학원 정보 : 학원이름 ="Academy", 지점
	* - 수강정보 : 수강과목, 시간(2023-08-16~2024-03-14)
	*
	* EX) 홍길동, 990101, 24, 010-1111-1111 => 학생정보 출력
	*     Academy, 서울지점			 		  => 학원 정보 출력
	*     자바(6개월), DB(1개월), HTML(2개월)	  => 수강정보 출력
	*
	* 기능 
	* - 학생정보출력, 학원정보출력, 수강정보출력
	* - 학생의 수강정보를 추가하는 기능
	* */
	
	// 멤버변수 선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	// final = 변경불가능한
	public final static String company = "Academy";
	private String branch;
	private String[] course = new String[5]; // 수강과목 5개
	private String[] period = new String[5]; // 수강기간 5개
	private int cnt; // 배열의 index 처리
	
	// 생성자
	public ComputerCourse() {}
	public ComputerCourse(String name, String phone, String branch) {
		this.name=name;
		this.phone=phone;
		this.branch=branch;
	}
	public ComputerCourse(String name, String birth, int age, String phone, String branch) {
		this.name=name;
		this.birth=birth;
		this.age=age;
		this.phone=phone;
		this.branch=branch;
	}
	
	// 학생정보출력 메서드
	public void printInfo() {
		System.out.println(name+", "+birth+", "+age+", "+phone);
	}
	// 학원정보출력 메서드
	public void printCompany() {
		System.out.println(company+" ("+branch+")");
	}
	// 수강정보출력 메서드
	public void printCourse() {
		if(course.length == 0 || cnt ==0) {
			System.out.println("수강 이력이 없습니다.");
			return; // 출력을 멈추고 메서드 끝내기
		}
		for(int i =0; i<cnt; i++) {
			System.out.print(course[i]+"("+period[i]+") ");
		}
		System.out.println();
	}
	// 학생의 수강정보 추가 메서드
	public void insertCourse(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++; // index 증가
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}

	public static String getCompany() {
		return company;
	}
}

