package Lv4.학생관리프로그램;

import java.util.Scanner;

public interface Program {
	/* 1. 인터페이스
    	- 학생 리스트 출력 메서드
    	- 학생을 추가 메서드
    	- 학생을 검색 메서드
    	- 학생의 수강신청 메서드
    	- 학생의 수강철회 메서드 
    	- 메뉴 메서드*/
	
	void printStudent();	// 학생 전체 리스트 출력
	void insertStudent(Scanner scan);	// 스캐너로 매서드 내부에서 입력받기
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
}
