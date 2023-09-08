package quest02;

import java.util.Scanner;

public class 스탬프 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex)
		 * 3, * => ***
		 * 5, o => ooooo
		 * 7, ☆ => ☆☆☆☆☆☆☆
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드 호출 => 출력
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("횟수> ");
		int num = sc.nextInt(); 
		System.out.print("기호> ");
		String sign = sc.next();
		stamp(num,sign);

	}
	// 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
	public static void stamp(int num, String sign) {
		for(int i = 1; i <= num; i++) {
			System.out.print(sign);
		}
		
	}
}
