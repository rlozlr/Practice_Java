package Lv4.학생관리프로그램;

import java.util.Scanner;

public class StudentManager implements Program {
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로...
	 * - 학생 추가시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가
	 * */
	
	private Student[] std = new Student[5];
	private int stdCnt;

	@Override
	public void printStudent() {
		System.out.println("---학생 전체 정보---");
		for(int i = 0; i < stdCnt; i++) {
			std[i].printInfoStd(); //학생정보만
			std[i].printStdSub(); //수강정보 추가
			System.out.println("-------------------");
		}
	}

	// 1명의 정보값을 입력받아 객체를 생성한 후 std 배열에 추가
	//입력받은 값으로 객체를 생성
	//배열이 꽉 찼다면 배열복사후 배열 이동
	//배열에 등록
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("--학생정보입력--");
		System.out.print("학생명> ");
		String sName = scan.next();
		System.out.print("학과> ");
		String major = scan.next();
		System.out.println("------------");
		
		Student s = new Student(sName,major);
		if(stdCnt == std.length) {
			Student[] tmp = new Student[std.length+5];
			System.arraycopy(tmp, 0, std, 0, std.length);
			std = tmp;
		}
		std[stdCnt] = s;
		stdCnt++; 
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.print("찾는 학생명> ");
		String name = scan.next();
		
		for(int i = 0; i < stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				std[i].printInfoStd();
				std[i].printStdSub();
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	@Override
	public void registerSubject(Scanner scan) {
		int index = -1;
		System.out.print("수강신청 학생명> ");
		String name = scan.next();
		for(int i = 0; i < stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			System.out.print("수강신청 과목명> ");
			String subName = scan.next();
			Subject s = new Subject(subName);
			std[index].insertSub(s);
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {
		int index = -1;
		System.out.print("수강철회 학생명> ");
		String name = scan.next();
		for(int i = 0; i < stdCnt; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			System.out.print("취소할 과목명> ");
			String sName = scan.next();
			std[index].deleteSub(sName);
		}
	}
}
