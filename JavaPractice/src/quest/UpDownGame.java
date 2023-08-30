package quest;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35
		 * 입력> 10
		 * up 출력
		 * 입력> 20
		 * up 출력
		 * 입력> 40
		 * down 출력
		 * 입력> 35
		 * 정답입니다 출력
		 * */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----Up/Down 게임----");
		System.out.println("1~50 사이의 숫자를 맞춰보세요!");
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 숫자를 정하였습니다.");
		//System.out.println(random);	// 랜덤 수 확인용
		
		System.out.print("몇 번의 기회가 필요합니까 > ");
		int chance = sc.nextInt();
		if(chance < 1) {
			System.out.println("잘못된 입력입니다.");
		}else {
			for (int i = 1; i<=chance; i++) {
				System.out.print("숫자 입력> ");
				int me = sc.nextInt();
				if(me > 50 || me < 1) {
					System.out.println("범위를 벗어난 숫자입니다.");
				}else {
					if(me > random) {
						System.out.println("("+i+"/"+chance+") Down!");
					}else if (me < random) {
						System.out.println("("+i+"/"+chance+") Up!");
					}else {
						System.out.println("정답입니다! "+i+"번의 도전으로 맞추셨습니다.");
						break;
					}
				}
				if(i == chance) {
					System.out.println("정답을 맞추는데 실패했습니다.");
				}
			}
		}
		sc.close();
	}

}
