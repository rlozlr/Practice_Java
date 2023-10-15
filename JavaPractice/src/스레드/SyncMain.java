package 스레드;

public class SyncMain {

	public static Bank myBank = new Bank();	// 공유 영역
	public static void main(String[] args) {
		// Thread를 상속받는 클래스 생성 -
		// 홍길동이 가지고 있는 계좌 - 홍길동+김순이(생활비 계좌)
		// 잔액: 10000
		// 홍길동 5000원 출금, 김순이 10000원
		// 동기화 키워드 : synchronized
		
		Hong h = new Hong();
		h.start();
		
		Kim k = new Kim();
		k.start();
		

	}

}

class Hong extends Thread {
	public void run() {	// 입금
//		System.out.println("잔액 : " + SyncMain.myBank.getMoney());
		System.out.println("**<입금시작>**");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("입금 후 잔액 : " + SyncMain.myBank.getMoney());
	}
}

class Kim extends Thread {
	public void run() { // 출금
//		System.out.println("잔액 : " + SyncMain.myBank.getMoney());
		System.out.println("**<출금시작>**");
		SyncMain.myBank.minusMoney(5000);
		System.out.println("출금 후 잔액 : " + SyncMain.myBank.getMoney());
	}
}
class Bank {
	private int money = 10000;
	
	// 입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(3000); // 3초 후
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	// 출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(500);	// 0.5초후
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
