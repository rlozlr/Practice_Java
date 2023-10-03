package Lv4.학생관리프로그램;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/* 메뉴를 출력하여 사용자로부터 어떤 기능을 수행할 것인지 처리
		 * 1.학생등록|2.학생검색|3.학생리스트|4.수강신청|5.수강철회|6.종료
		 * */
		
		StudentManager sm = new StudentManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("--<<MENU>>--");
			System.out.println("1.학생등록|2.학생검색|3.학생리스트");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.print("메뉴선택 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("----학생등록----");
				sm.insertStudent(scan);
				break;
			case 2: 
				System.out.println("----학생검색----");
				sm.searchStudent(scan);
				break;
			case 3: 
				System.out.println("----학생조회----");
				sm.printStudent();
				break;
			case 4: 
				System.out.println("----수강신청----");
				sm.registerSubject(scan);
				break;
			case 5: 
				System.out.println("----수강철회----");
				sm.deleteSubject(scan);
				break;
			case 6:	break;
			default: System.out.println("잘못된 입력입니다.");
			}
			
		}while(menu != 6);
		
		System.out.println("프로그램 종료");
		
		scan.close();
	}
}
