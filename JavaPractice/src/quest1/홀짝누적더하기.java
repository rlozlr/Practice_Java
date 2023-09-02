package quest1;

public class 홀짝누적더하기 {

	public static void main(String[] args) {
		// 1부터 10까지 짝수의 합과 홀수의 합을 출력
		int evenSum =0;
		int oddSum=0;
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("짝수의 합> "+evenSum);
		System.out.println("홀수의 합> "+oddSum);
	}

}
