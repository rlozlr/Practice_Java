package Lv4.고객관리프로그램;

public class GoldCustomer extends Customer{
	protected String goldCustomerGrade = "Gold";
	protected double goldBonusRatio = 0.02;
	protected double goldSaleRatio = 0.9;
	
	public GoldCustomer() {
		customerGrade = goldCustomerGrade;
		bonusRatio = goldBonusRatio;
		saleRatio = goldSaleRatio;
	}

	public GoldCustomer(String customerName, int bonusPoint) {
		super(customerName, bonusPoint);
		customerGrade = goldCustomerGrade;
		bonusRatio = goldBonusRatio;
		saleRatio = goldSaleRatio;
	}
	
	@Override
	public void calcPirce(int price) {
		super.calcPirce(price);
	}

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
	}

}
