package Lv6.학생관리프로그램;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program {
	// 멤버변수 Student List
	private List<Student> student = new ArrayList<>();
	
//	이렇게 하면 메인에 add(); 호출 안해도 됨
//	반드시 필요하면 이렇게 하는게 좋고
//	아니면 메인에서 호출하는게 나음
	public StudentManager() {	
		add();
	}
	
	// 기본 학생 추가
	public void add() {
		student.add(new Student("해리", 16, "010-1111-1111"));
		student.add(new Student("론", "010-1111-2222"));
		student.add(new Student("말포이","010-3333-3333"));
		student.add(new Student("헤르미온느", 16, "010-1111-5555"));
		student.add(new Student("해그리드"));
	}

	@Override
	public void addStd(Scanner scan) {
		System.out.print("추가 학생명> ");
		student.add(new Student(scan.next()));
		System.out.println("학생등록 완료!!");
		
	}

	@Override
	public void printStd() {
		// 학생 기본정보 출력
		System.out.println("--------학생명단--------");
		for(int i=0; i<student.size(); i++) {
			System.out.println(student.get(i));
		}
		System.out.println("----------------");
	}

	@Override
	public void searchStd(Scanner scan) {
		// 학생명을 입력받아 학생정보를 출력
		System.out.print("학생명> ");
		String name = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색한 학생을 찾을 수 없습니다.");
		
	}

	@Override
	public void modStd(Scanner scan) {
		// 수정할 정보(이름, 나이, 전화번호)
		System.out.print("학생명 > ");
		String name = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보> ");
				String op = scan.next();
				switch(op) {
				case "이름":
					System.out.print("수정할 값 > ");
					String modName = scan.next();
					student.get(i).setName(modName);
					System.out.println("*--수정완료--*");
					break;
				case "나이": 
					System.out.print("수정할 값 > ");
					int modAge = scan.nextInt();
					student.get(i).setAge(modAge);
					System.out.println("*--수정완료--*");
					break;
				case "전화번호": 
					System.out.print("수정할 값 > ");
					String modPhone = scan.next();
					student.get(i).setPhone(modPhone);
					System.out.println("*--수정완료--*");
					break;
					default : 
						System.out.println("존재하지 않습니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		// 학생명을 입력받아 일치하는 학생을 삭제
		// remove는 index 삭제, remove 삭제가 가능.
		System.out.print("학생명 > ");
		String name = scan.next();
//		for(int i = 0; i < student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				System.out.println("["+name+"]의 모든 정보를 삭제했습니다.");
//				return;
//			}
//		}
//		System.out.println("학생이 존재하지 않습니다.");
		
		// remove(object) 삭제 => object 자체로 이름이 일치하면 같은객체
		if(!student.remove(new Student(name))) {
			System.out.println("학생이 존재하지 않습니다.");
			return;
		}
		student.remove(new Student(name));
		
		
	}

	@Override
	public void addSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 수강신청 메서드 호출
		System.out.print("학생명 > ");
		String name = scan.next();
		System.out.print("과목 > ");
		String sub = scan.next();
		System.out.print("점수 > ");
		int score = scan.nextInt();
		
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		// 과목/점수 수정
		System.out.print("학생명 > ");
		String name = scan.next();
		System.out.print("과목 > ");
		String sub = scan.next();
		System.out.print("점수 > ");
		int score = scan.nextInt();
		
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
					student.get(i).delSubject(sub);
					student.get(i).addSubject(sub, score);
					return;
				}
			}
		System.out.println("학생이 존재하지 않습니다.");
		}
		

	@Override
	public void delSub(Scanner scan) {
		// 학생명과 과목을 입력받아 삭제 메서드 호출
		System.out.print("학생명 > ");
		String name = scan.next();
		System.out.print("과목 > ");
		String sub = scan.next();
//		for(int i = 0; i < student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//			}
//		}
		// index 메소드 활용
		int i = index(name);
		if(i==-1) {
			System.out.println("학생이 없습니다");
		} else {
			student.get(i).delSubject(sub);
		}
	}
	
	// 학생명을 주고, 그 학생명의 위치를 리턴하는 메서드
	public int index(String name) {
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1; // 0번지 포함이기 때문에 아니면 -1로 리턴.
	}

}