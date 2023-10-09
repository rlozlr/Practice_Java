package Lv5.음식주문프로그램;

import java.util.ArrayList;
import java.util.List;

public class FoodManager {
	// 멤버변수 ArrayList 메뉴, ArrayList 가격
	// 그 외 필요한 멤버변수는 선택
	private List<String> listMenu = new ArrayList<String>();
	private List<Integer> listPrice = new ArrayList<Integer>();
	private int sum;
	private int total;
	
	public FoodManager() { 
		add();
	}

	//메서드
	//출력 : 메뉴출력, 결과출력, add(), sale()
	// 메뉴출력 메소드
	public void printMenu() {
		System.out.println("--메뉴--");
		System.out.println("1. 햄버거: 7000 ");
		System.out.println("2. 피자: 15000");
		System.out.println("3. 음료수: 2000");
		System.out.println("4. 과자: 1000 ");
		System.out.println("5. 사탕: 500");
		System.out.print("메뉴선택 > ");
	}
	
	// 기본 메뉴
	public void add() {
		listMenu.add("햄버거");
		listMenu.add("피자");
		listMenu.add("음료수");
		listMenu.add("과자");
		listMenu.add("사탕");
		
		listPrice.add(7000);
		listPrice.add(15000);
		listPrice.add(2000);
		listPrice.add(1000);
		listPrice.add(500);
	}
	
	public void sale(int menu, int count) {
		sum = listPrice.get(menu-1) * count; 
		total += sum;
		System.out.println("==============");
		System.out.println("["+listMenu.get(menu-1)+"]  "+count+ "개");
		System.out.println("금액: " + sum +"원");
		System.out.println("====주문 완료====");
		System.out.println();
		
	}
	
	public void printResult() {
		
	}

	public List<String> getListMenu() {
		return listMenu;
	}

	public void setListMenu(List<String> listMenu) {
		this.listMenu = listMenu;
	}

	public List<Integer> getListPrice() {
		return listPrice;
	}

	public void setListPrice(List<Integer> listPrice) {
		this.listPrice = listPrice;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
