package quest;

public class SwitchRandom {

	public static void main(String[] args) {
		/* 1~6까지의 수를 랜덤으로 추출하여 
		 * '주사위 : 1칸 전진' 출력
		 * */
		
		// 1~6까지의 랜덤 생성
		int dice = (int)(Math.random()*6)+1;
		
		//랜덤 수에 따른 출력
		switch(dice) {
		case 1: System.out.println("주사위 : "+dice+"칸 전진"); break;
		case 2: System.out.println("주사위 : "+dice+"칸 전진"); break;
		case 3: System.out.println("주사위 : "+dice+"칸 전진"); break;
		case 4: System.out.println("주사위 : "+dice+"칸 전진"); break;
		case 5: System.out.println("주사위 : "+dice+"칸 전진"); break;
		case 6: System.out.println("주사위 : "+dice+"칸 전진"); break;
		default:
			System.out.println("주사위를 다시 던져주세요.");
		}

	}

}
