package Lv5.키오스크프로그램;

public class Menu {
	// 메뉴와 가격을 나타내는 클래스 생성
	// 멤버변수, 생성자, getter/setter, toString
	
	private String menu;
	private int price;
	
	public Menu() { }
	public Menu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return menu + " : " + price;
	}
	
	
	
	
	

}
