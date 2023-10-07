package Lv4.로또;

public class LottoE extends Lotto{
	// 당첨번호 생성 클래스 Lotto를 상속받아서 보너스 번호만을 처리
	private int bonus;

	//오버라이딩 메서드 : randomLotto(), init, toString, selectNum
	@Override
	protected void randomLotto() {
		super.randomLotto();
		
		while(true) {
			int r = random();
			if(!isContain(r) ) {
				bonus = r;
				break;
			}
		}
	}

	@Override
	protected void init() {
		super.init();
		bonus  = 0;
	}

	@Override
	public String toString() {
		return super.toString()+"["+bonus+"]";
	}

	@Override
	protected void selectNum(int[] arr) {
		super.selectNum(arr);
		bonus = arr[arr.length-1];
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
