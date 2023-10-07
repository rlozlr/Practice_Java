package Lv4.고객관리프로그램;

public class VIPCustomer extends Customer {
	//전담상담사를 갖는다. (int agentID)
	private int agentID;
	protected String vipCustomerGrade = "VIP";
	protected double vipBonusRatio = 0.05;
	protected double vipSaleRatio = 0.8;
	
	public VIPCustomer() {
		customerGrade = vipCustomerGrade;
		bonusRatio = vipBonusRatio;
		saleRatio = vipSaleRatio;
	}
	
	public VIPCustomer(String customerName, int bonusPoint) {
		super(customerName, bonusPoint);
		customerGrade = vipCustomerGrade;
		bonusRatio = vipBonusRatio;
		saleRatio = vipSaleRatio;
	}
	

	@Override
	public void calcPirce(int price) {
		super.calcPirce(price);
	}

	// 전담 상담사 번호는 1111입니다. - VIP 클래스에서 추가해주기
	@Override
	public void customerInfo() {
		super.customerInfo();
		agent();
		System.out.println("전담 상담사 번호는 "+agentID+"입니다.");
	}
	
	//전담사 번호 만들어주기
	public int agent() {
		agentID = (int)(Math.random()*5000)+1000;
		return agentID;
	}

}