package Lv4.고객관리프로그램;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c1 = new Customer("스파이더맨", 1000);
		GoldCustomer c2 = new GoldCustomer("토르", 3000);
		VIPCustomer c3 = new VIPCustomer("아이언맨", 5000);
		System.out.println("-------");
		int price = 10000;
		
		c1.calcPirce(price);
		c1.customerInfo();
		System.out.println("-----------");
		c2.calcPirce(price);
		c2.customerInfo();
		System.out.println("-----------");
		c3.calcPirce(price);
		c3.customerInfo();

	}

}

