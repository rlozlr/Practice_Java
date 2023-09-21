package Lv3.카드;

public class CardPack {
	/*
	 * CardPack 클래스 - 카드팩 : 52장의 카드들
	 * 
	 * 멤버변수 : 카드를 52장 담을 수 있는 배열 
	 * 생성자 : 52장의 카드를 모두 생성 
	 * 메서드 : 
	 * - 카드를 섞는 기능 
	 * - 카드를 한 장 빼내는 기능 
	 * - 카드 출력 => Card클래스의 print 메서드 사용 
	 * - 카드 초기화 메서드
	 */
	private Card[] cardPack = new Card[52];
	private int cnt;
	
	public CardPack() {
		// ♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
		String shape = "♥";
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				shape = "♥";
				break;
			case 2:
				shape = "♣";
				break;
			case 3:
				shape = "♠";
				break;
			case 4:
				shape = "◆";
				break;
			}
			for (int j = 1; j <= 13; j++) { // 숫자
				Card c = new Card(); // 카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				cardPack[cnt] = c;
				cnt++;
			}
		}
	}

	// 카드를 섞는 메서드
	public void shuffle() {
		for (int i = 0; i < cardPack.length; i++) {
			int index = (int) (Math.random() * 52) + 0;
			Card tmp = cardPack[i];
			cardPack[i] = cardPack[index];
			cardPack[index] = tmp;
		}
	}
	
	// 카드를 한 장 빼내는 기능
	// 리턴타입 Card 카드 1장
	public Card pick() {
		if(cnt == 0) {
			return null;
		}
		cnt--;
		return cardPack[cnt]; // 52
	}
	
	// 초기화 기능 : cnt만 마지막으로 다시 보내기
	public void initialCard() {
		cnt = 52;
	}

	public Card[] getCardPack() {
		return cardPack;
	}

	public void setCardPack(Card[] cardPack) {
		this.cardPack = cardPack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

}
