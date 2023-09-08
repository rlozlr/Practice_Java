package quest01;

import java.util.Scanner;

public class 소수01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13, 17...
		 * */
		
		/* num를 입력 받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력> ");
		int num = sc.nextInt();
		
		int cnt = 0;	// 소수는 약수가 1과 나 자신의 수만 가지고 있으므로 약수 개수를 cnt로 세어주기 위해
		for(int i = 1; i<=num; i++) {	// 숫자 1부터 자신의 수까지 1씩 증가해서
			if(num % i == 0) {	//자신의 수에 i로 나누었을 때 나머지가 0이면
				cnt++;	// 그 i의 숫자가 몇 개인지 카운트를 센다 => num이 약수를 몇 개 가졌는지 세어보겠다는 의미
			}
		}
		if (cnt == 2) {	// 약수가 2개면
			System.out.println("소수입니다.");
		}else {	// 약수가 2개가 아니라면
			System.out.println("소수가 아닙니다.");
		}
		
		sc.close();

	}

}
