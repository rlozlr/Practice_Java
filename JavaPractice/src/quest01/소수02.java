package quest01;

public class 소수02 {

	public static void main(String[] args) {
		/* 2~100까지 중 소수를 출력 == int i
		 * 약수 값은 1~i까지 돌려서 약수를 구해야 함*/
		System.out.println("2에서 100사이의 소수만 출력");
		
		for(int i = 2; i <= 100; i++ ) {	// 2에서 100까지
			int cnt = 0;	// 약수의 개수를 알기 위한 카운트
			for(int j = 1; j <= i; j++) {	//소수는 1과 자신의 수만 가지므로 범위를 1에서 자신의 수까지로 정해준다
				if(i % j == 0) {	// i를 j로 나누었을 때 나머지가 0이라면
					cnt++;	// 카운트를 센다 => 약수의 개수를 세겠다는 의미
				}
			}
			if( cnt == 2) {	// i의 약수가 2개라면
				System.out.print(i+" ");	// i를 출력
			}
		}

	}

}
