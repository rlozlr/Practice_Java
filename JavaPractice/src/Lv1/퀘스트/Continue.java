package Lv1.퀘스트;

public class Continue {

	public static void main(String[] args) {
		/* 1~10까지 중 홀수만 출력
		 * 짝수일 때 continue를 써서 출력
		 * */
		
		for(int i = 0; i <=10; i++) {
			if(i % 2 == 0) {
				continue;	// i가 짝수일 때 지나쳐라
			}else {
				System.out.print(i+" ");
			}
		}
	}

}
