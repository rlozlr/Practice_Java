package Lv4.고객관리프로그램;

public class Customer {
	/* 고객 클래스
	 * 일반고객 / Gold고객 / VIP고객 
	 * 
	 * 멤버변수 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 
	 * - Customer 객체 생성시
	 * 기본 customerGrade = Silver
	 * 기본 double bonusRatio = 0.01
	 * 
	 * - 메서드
	 * - 보너스 적립 게산 메서드(메서드명 : calcPirce(int price))
	 * 	=> 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴
	 * 
	 * 	구매금액을 주고, 적립보너스계산, bonusPoint 누적, 실 구매금액 리턴
	 * 
	 * - 출력 메서드 (메서드명 : customerInfo())
	 * 	홍길동님의 등급은 VIP이며, 보너스 포인트는 1000점입니다.
	 * 	전담 상담사 번호는 1111입니다. - VIP만 출력
	 * 
	 * - Silver등급
	 * 	제품을 구매할 때 할인 없음. / 보너스포인트 1% 적립
	 * 
	 * - Gold등급
	 * 	제품을 구매할 때 10% 할인 / 보너스포인트 2% 적립
	 * 
	 * - VIP등급
	 *  제품을 구매할 때 20% 할인 / 보너스포인트 5% 적립
	 *  전담상담사를 갖는다. (int agentID)
	 * */
	
	protected int customerID;
	protected String customerName;
	protected int bonusPoint;
	protected String customerGrade = "Silver";
	protected double bonusRatio = 0.01;
	protected double saleRatio = 1;
	
	
	public Customer () { }
	
	public Customer(String customerName, int bonusPoint) {
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
	}

	// 보너스 적립 게산 메서드(메서드명 : calcPirce(int price))
	// 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴
	public void calcPirce(int price) {
		int insertBonus = (int) (price*bonusRatio);
		bonusPoint += insertBonus;
		System.out.println("적립된 보너스> "+ insertBonus+"점");
		System.out.println("누적된 보너스> "+ bonusPoint+"점");
		System.out.println("원가> "+ price+"원");
		System.out.println("할인금액> "+ (int)(price-(price*saleRatio))+"원");
		
		price = (int)(price*saleRatio);
		System.out.println("할인이 적용된 금액> "+ price+"원");
		
	}
	
	// 출력 메서드 (메서드명 : customerInfo())
	// 홍길동님의 등급은 VIP이며, 보너스 포인트는 1000점입니다.
	// 전담 상담사 번호는 1111입니다. - VIP 클래스에서 추가해주기
	public void customerInfo() {
		System.out.println("["+customerName+"]님의 등급은 "+ customerGrade +"이며, 보너스 포인트는 "+bonusPoint+"점 입니다.");
	}
	
	

}
