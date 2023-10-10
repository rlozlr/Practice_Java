package Lv5.키오스크프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	// menu 클래스를 리스트로 구현
	private ArrayList<Menu> item = new ArrayList<>(); //String, int
	private ArrayList<Menu> order = new ArrayList<>();
	private int totalPrice = 0;
	
	public SaleManager() {
		addMenu();
	}
	
	public void addMenu() {
		item.add(new Menu("햄버거", 7000));
		item.add(new Menu("피자", 12000));
		item.add(new Menu("음료", 2000));
		item.add(new Menu("사탕", 500));
	}
	
	// 메뉴 추가 기능
	public void add(Scanner scan) {
		System.out.print("메뉴명> ");
		String menu = scan.next();
		System.out.print("가격> ");
		int price = scan.nextInt();
		
		Menu m = new Menu(menu,price);
		item.add(m);
		System.out.println("**** 메뉴 추가 완료 ****");
		System.out.println();
	}
	// 메뉴 리스트
	public void printProduct() {
		System.out.println("---menu---");
		for(int i = 0; i < item.size(); i++) {
			System.out.println((i+1)+". "+item.get(i));
		}
		System.out.println("------------------");
	}
	
	// 주문리스트로 구현
	public void orderPick(Scanner scan) {
		System.out.print("주문 메뉴번호: ");
		// 1. 메뉴를 직접 한글로 받는 케이스
//		String menu = scan.next();	// 햄버거
		// 2. 메뉴를 숫자로 받는 케이스
		int pick = scan.nextInt();	// 번호 : index-1
		String tmpMenu = item.get(pick-1).getMenu();	// 햄버거
		
		if(tmpMenu == null) {
			System.out.println("찾는 메뉴가 없습니다.");
			return;
		}else {
			System.out.print("주문수량: ");
			int count = scan.nextInt();
			int tmpPrice = item.get(pick-1).getPrice();
			totalPrice += (tmpPrice*count);
			
			Menu m = new Menu(tmpMenu, count);	// 메뉴와 개수
			order.add(m);
			System.out.println("["+tmpMenu+"] "+"	("+count+")개"+tmpPrice+"원");
			System.out.println("주문이 추가되었습니다.");
		}
		System.out.println("****************");
	}
	
	// 메뉴 추가 기능, 메뉴 생성, 주문 처럼
	public void printOrder() {
		int sum = 0;
		int index = 1;
		for(Menu m : order) {
			String menu = m.getMenu();
			int price = findMenu(menu);
			System.out.println(index+". "+m+"개    "+(m.getPrice()*price)+"원");
			index++;
		}
		System.out.println("===================");
		System.out.println("Total: "+totalPrice+"원");
		System.out.println();
		
	}
	
	public int findMenu(String menu) {
		for(Menu m : item) {
			if(m.getMenu().equals(menu)) {
				return m.getPrice();
			}
		}
		return -1;
	}
}
