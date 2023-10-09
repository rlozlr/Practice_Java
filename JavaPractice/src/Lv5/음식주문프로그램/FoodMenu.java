package Lv5.음식주문프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		/*
		 * --메뉴판-- 
		 * 1. 햄버거: 7000 
		 * 2. 피자: 15000 
		 * 3. 음료수: 2000
		 * 4. 과자: 1000 
		 * 5. 사탕: 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴선택 > 1 
		 * 수량 > 2 
		 * => 1번 햄버거 2개 주문 
		 * 주문을 끝내시려면 0을 눌러주세요. 1
		 * 메뉴선택 > 3 
		 * 수량 > 2 
		 * => 음료 2개 주문 
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * -- 선택한 메뉴 
		 * 1.햄버거 2개 2.음료 2개 
		 * 총 지불금액 000원
		 */
		FoodManager fm = new FoodManager();
		System.out.println(fm.getListMenu());
		System.out.println(fm.getListPrice());
		
		ArrayList<Integer> order = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		int menu = -1;
		do {
			fm.printMenu(); // 메뉴출럭
			menu = scan.nextInt(); // 메뉴입력받기
			// 1~5 일반메뉴, 6프로그램종료, 0 메뉴선택 끝
			if (menu == 6) {
				System.out.println("프로그램 종료");
				break;
			}
			if (menu != 0) {
				if (menu < 6) {
					System.out.print("수량 > ");
					int cnt = scan.nextInt();
					order.add(menu);
					count.add(cnt);
					fm.sale(menu, cnt);
					System.out.println("주문종료 (0) , 프로그램종료 (6)");
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		} while (menu != 0); // 메뉴주문의 종료시점 결정
		// 메뉴의 전체 금액을 출력. totalSum
		// 피자 3개
		// order = 2-1 / count = 3
		System.out.println("----주문 확인----");
		for (int i = 0; i < order.size(); i++) {
			System.out.print((i+1)+". "+fm.getListMenu().get(order.get(i) - 1) + " "); // 피자
			System.out.print(count.get(i) + "개 ");
			int price = fm.getListPrice().get(order.get(i) - 1);
			System.out.println("    " + (price * count.get(i)) + "원");
		}
		System.out.println("---------------");
		System.out.println("총 금액 : " + fm.getTotal() +"원");
		
		scan.close();

	}

}
