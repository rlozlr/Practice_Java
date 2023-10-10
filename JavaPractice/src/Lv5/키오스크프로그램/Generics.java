package Lv5.키오스크프로그램;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		/* 제네릭(Generic) 클래스 
		 * 클래스 선언시 구체적인 타입을 기재하지 않고 사용할 수 있도록 해주는 방식
		 * <클래스> : String, Integer Student, Subject
		 * */
		
		/* --메뉴판--
		 * 1.햄버거:7000
		 * 2.피자:15000
		 * 3.음료수:2000
		 * 4.과자:1000
		 * 5.사탕:500
		 * 6.프로그램 종료
		 * 
		 * 메뉴선택 > 1
		 * 수량 > 2
		 * => 1번 햄버거 2개 주문
		 * 메뉴선택 > 3
		 * 수량 > 2
		 * => 3번 음료 2개 주문
		 * 
		 * --선택한 메뉴
		 * 1.햄버거 2개
		 * 2.음료 2개
		 * 총 지불금액 000원
		 * */
		
		//메인 메뉴 출력과 처리
		//1.메뉴추가 | 2.메뉴출력 | 3.주문 | 4.주문리스트 |5.종료
		
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		do {
			System.out.println("1.메뉴추가 | 2.메뉴출력 | 3.주문 | 4.주문리스트 | 5.종료");
			System.out.print("메뉴입력: ");
			menu = scan.nextInt();

			switch (menu) {
			case 1: sm.add(scan); break;
			case 2: sm.printProduct(); break;
			case 3: sm.orderPick(scan); break;
			case 4: sm.printOrder(); break;
			case 5: break;
			default: 
				System.out.println("잘못된 입력입니다."); 
				break;
			}
		} while (menu != 5);
	}
}

