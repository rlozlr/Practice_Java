package Lv2.퀘스트;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지 랜덤수
		 * ex)
		 * 주사위 : 3
		 * 3칸 이동 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 이동 => ?? 칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동 횟수 :  총 8번을 던져서 완주했습니다.
		 * */
		int goal = 30;
		int count = 0;

		// 무한 루프를 주고
		while (true) {
			int dice = (int) (Math.random() * 6) + 1;
			goal -= dice;
			count++;
			
			System.out.println("주사위 : " + dice);
			System.out.println(dice + "칸 이동");
			System.out.println(goal + "칸 남았습니다.");
			
			// 도착했을 때 break로 무한루프를 빠져나간다
			if(goal <=0) {
				System.out.println("도착~!!");
				System.out.println("총 " + count + "번 던져서 완주했습니다.");
				break;
			}
		}
	}
}

