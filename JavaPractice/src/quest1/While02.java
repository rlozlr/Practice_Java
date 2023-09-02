package quest1;

public class While02 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ...
		 * 42 44 46 48 50
		 * 
		 * 1~50까지 짝수만 출력
		 * 5개씩 한 줄로
		 * */
		
		int i = 1;	// i 초기화
		int cnt = 0;	// 숫자 카운트용
		while (i <= 50) {	// i가 50일 때까지 작동
			if( i % 2 == 0) {	// i가 2로 나누었을 때 나머지가 0이라면
				System.out.print(i+" ");	// i 출력하고
				cnt++;	// 카운트를 센다
				if(cnt % 5 == 0) {	// 숫자를 세고있던 cnt가 5개로 나누었을 때 나머지가 0이 되면
					System.out.println();	// 줄바꿈을 해라
				}
			}
			i++;	// i++을 해주지 않으면, i는 초기값에서 변화를 가질 수 없다.
		}
	}

}
