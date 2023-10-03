package Lv3.상품등록;

public class Product {
//	Product class 생성
//	메뉴이름, 가격
//	메뉴, 가격 추가 메서드
//	메뉴 : 가격 출력 메서드

	private String name;
	private int price;

	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

// 메뉴, 가격 추가 메서드
	public void insertMenu(String name, int price) {
		this.name = name;
		this.price = price;
	}
// 메뉴 : 가격 출력 메서드
	@Override
	public String toString() {
		return name + " : " + price + "원";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
