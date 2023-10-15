package Lv6.학생관리프로그램;

import java.util.Scanner;

public interface Program {
	/* 1.학생추가 | 2.학생리스트 | 3.학생검색
	 * 4.학생수정 | 5.학생삭제 | 6.과목추가
	 * 7.점수수정 | 8.과목삭제 | 9.종료
	 * */
	
	void addStd(Scanner scan);
	void printStd();
	void searchStd(Scanner scan);
	void modStd(Scanner scan);
	void delStd(Scanner scan);
	void addSub(Scanner scan);
	void modSub(Scanner scan);
	void delSub(Scanner scan);

}