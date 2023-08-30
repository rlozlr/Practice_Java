package quest;

import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		/*
		 * 최대공약수 찾기 약수 : 1부터 자기 자신까지 나누어서 떨어지는 수 
		 * 공약수 : 두 정수의 공통된 약수 최대공약수 : 공약수 중 가장 큰 값
		 * 
		 * 8 : 1 2 4 8 => num1 % i == 0 
		 * 12 : 1 2 3 4 6 12 => num2 % i == 0 
		 * 공약수 : 1 2 4
		 * 최대공약수 : 4
		 */

		// 두 정수 num1, num2를 입력받아 최대 공약수를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수> ");
		int num2 = sc.nextInt();
		int max = 0;

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		System.out.println("최대 공약수> " + max);
		sc.close();

	}

}
