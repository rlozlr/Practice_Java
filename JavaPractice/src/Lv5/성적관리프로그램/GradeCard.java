package Lv5.성적관리프로그램;

import java.util.Scanner;

public class GradeCard {

	public static void main(String[] args) {
		ScoreManager sm = new ScoreManager();
		Scanner scan = new Scanner(System.in);
		
		// 메뉴선택
		int select = -1;
		while(select !=6) {
			sm.printMenu();	// 메뉴출력
			System.out.print("메뉴선택> ");
			select = scan.nextInt();
			
			switch (select) {
			case 1:	sm.add(scan); break;
			case 2:	sm.totalScore(); break;
			case 3: sm.subjectScore(scan); break;
			case 4: sm.editScore(scan); break;
			case 5: sm.delScore(scan); break;
			case 6: sm.exit(); break;
			default: System.out.println("잘못된 접근입니다."); break;
			}
		}
	}

}
