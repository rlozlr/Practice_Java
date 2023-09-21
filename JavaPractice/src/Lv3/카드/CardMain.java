package Lv3.카드;

public class CardMain {

	public static void main(String[] args) {
		// 카드 클래스 확인
		Card cd = new Card();

		// 기본 생성자 확인
		cd.print();

		// 정상 카드모양 숫자 출력 확인
		cd.setShape("♣");
		cd.setNum(13);
		cd.print();

		// 비정상 카드모양 숫자 출력 확인
		cd.setShape("$");
		cd.setNum(19);
		cd.print();
		System.out.println(); // 줄바꿈
		System.out.println("============================="); // 구분선

		// 카드팩 클래스 확인
		CardPack cp = new CardPack();
		cp.shuffle(); // 카드 섞기

		// 카드 출력
		for (int i = 0; i < cp.getCardPack().length; i++) {
			cp.getCardPack()[i].print();
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}

		System.out.println("--------------------");
		System.out.println();
		Card tmp = cp.pick(); // 카드 하나 뽑기
		tmp.print();
		System.out.println();
		System.out.println("--------------------");
		cp.pick().print(); // 카드 하나 뽑기
		System.out.println();
		System.out.println("--------------------");
		for (int i = 0; i < cp.getCnt(); i++) { // 뽑은 카드가 없어졌는지 확인
			cp.getCardPack()[i].print();
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("--------------------");
		cp.initialCard(); // 카드 초기화
		cp.shuffle();
		for (int i = 0; i < cp.getCardPack().length; i++) { // 카드 초기화 확인
			cp.getCardPack()[i].print();
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}

	}

}
