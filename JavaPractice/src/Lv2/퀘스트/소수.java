package Lv2.퀘스트;

public class 소수 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 메인 : 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		for(int i = 2; i<=100; i++) {
			if(check(i)) {
				System.out.print(i+" ");
			}
		}
	}
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true/false)
	 * 소수 : 1과 자기 자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num
	 * 메서드명 :check
	 * */
	public static boolean check(int num) {
		int cnt = 0;
		// 소수는 1과 자신만 가지고 있으므로 num까지
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;	// cnt가 약수 개수를 세어준다
			}
		}
		if(cnt == 2) {
			return true;
		}
		return false;
	}
}
