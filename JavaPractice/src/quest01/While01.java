package quest01;

public class While01 {

	public static void main(String[] args) {
		// 1~10까지 짝수만 출력
		int i = 1;	// i 초기값 설정
		while (i < 11) {	// i가 11이라면 멈춘다
			if(i % 2 == 0 ) {
				System.out.print(i+" ");
			}
			i++;	// if문이 끝나면 i를 1씩 증가시킨다.
					// i++을 해주지 않으면 i는 초기값인 1에서 변하지 않는다.
		}

	}

}
